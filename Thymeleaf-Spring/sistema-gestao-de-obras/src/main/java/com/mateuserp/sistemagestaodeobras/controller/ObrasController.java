package com.mateuserp.sistemagestaodeobras.controller;

import java.util.Optional;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Optionals;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mateuserp.sistemagestaodeobras.model.Obra;
import com.mateuserp.sistemagestaodeobras.repository.ObraRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
@RequestMapping("/obras")
public class ObrasController {

    @Autowired
    ObraRepository obraRepository;

    @RequestMapping("/cadastrar")
    public String cadastrar() {
        return "/obra/cadastro";
    }

    @RequestMapping("/listar")
    public String listar(ModelMap model) {
        model.addAttribute("obra", obraRepository.findAll());
        return "/obra/lista";
    }

    @PostMapping("/salvar")
    private String salvar(Obra obra, RedirectAttributes attr) {
        obraRepository.save(obra);
        attr.addFlashAttribute("success", "Cargo Inserido com Sucesso no Sistema");
        return "redirect:/obras/cadastrar";
    }

    @GetMapping("/editar/{id}")
    public String preEditar(@PathVariable("id") Long id, ModelMap model) {
        Optional<Obra> obrOptional = obraRepository.findById(id);
        Obra obra = obrOptional.get();
        model.addAttribute("obra", obra);
        return "obra/cadastro";
    }
    
    @PostMapping("/editar")
    public String editar(Obra obra, RedirectAttributes attr) {
        obraRepository.save(obra);
        attr.addAttribute("success", "Obra Editada com Sucesso!");
        return "redirect:/obras/listar";
    }

    
}
