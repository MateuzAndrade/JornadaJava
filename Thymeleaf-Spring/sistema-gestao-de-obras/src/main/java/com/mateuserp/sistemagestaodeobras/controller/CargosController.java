package com.mateuserp.sistemagestaodeobras.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mateuserp.sistemagestaodeobras.model.Cargo;
import com.mateuserp.sistemagestaodeobras.repository.CargoRespository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping("/cargos")
public class CargosController {

    @Autowired
    CargoRespository cargoRespository;

    @RequestMapping("/cadastrar")
    public String cadastrar(Cargo cargo) {
        return "cargo/cadastro";
    }

    @GetMapping("/listar")
    public String listar(ModelMap model) {
        model.addAttribute("cargos",cargoRespository.findAll());
        return "cargo/lista";
    }

    @PostMapping("/salvar")
    private String salvar(Cargo cargo, RedirectAttributes attr){
        cargoRespository.save(cargo);
        attr.addFlashAttribute("success", "Cargo Inserido com Sucesso no Sistema");
        return "redirect:/cargos/cadastrar";
    }

    @GetMapping("/editar/{id}")
    public String preEditar(@PathVariable("id") Long id, ModelMap model) {
        Optional<Cargo> cargoOptional = cargoRespository.findById(id);
        Cargo cargo = cargoOptional.get();
        model.addAttribute("cargo", cargo);
        return "cargo/cadastro";
    }
        

    @PostMapping("/editar")
    public String editar(Cargo cargo, RedirectAttributes attr){
        cargoRespository.save(cargo);
        attr.addAttribute("success", "Cargo Editado com Sucesso!");
        return "redirect:/cargos/listar";
    }
    

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable("id") Long id, ModelMap model) {
        cargoRespository.deleteById(id);
        model.addAttribute("success", "Cargo excluído com sucesso");
        return listar(model);
    }
    

}
