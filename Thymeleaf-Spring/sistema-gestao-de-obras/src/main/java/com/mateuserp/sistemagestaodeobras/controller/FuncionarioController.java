package com.mateuserp.sistemagestaodeobras.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mateuserp.sistemagestaodeobras.model.Cargo;
import com.mateuserp.sistemagestaodeobras.model.Funcionario;
import com.mateuserp.sistemagestaodeobras.repository.CargoRespository;
import com.mateuserp.sistemagestaodeobras.repository.FuncionarioRepository;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    FuncionarioRepository funcionarioRepository;
    @Autowired
    CargoRespository cargoRespository;

    @RequestMapping("/cadastrar")
    public String cadastrar(Funcionario funcionario) {
        return "/funcionario/cadastro";
    }

    @RequestMapping("/listar")
    public String listar() {
        return "/funcionario/lista";
    }

    @PostMapping("/salvar")
    public String salvar(Funcionario funcionario, RedirectAttributes attr) {
        funcionarioRepository.save(funcionario);
        attr.addFlashAttribute("Sucesso", "Funcionário Inserido com Sucesso no Sistema");
        return "redirect:/funcionarios/cadastrar";
    }


    @ModelAttribute("cargos")
    public List<Cargo> getCargos() {
        return cargoRespository.findAll();
    }
    

}
