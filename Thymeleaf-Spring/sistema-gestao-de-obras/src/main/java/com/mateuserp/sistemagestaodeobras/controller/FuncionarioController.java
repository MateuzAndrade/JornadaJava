package com.mateuserp.sistemagestaodeobras.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mateuserp.sistemagestaodeobras.model.Funcionario;
import com.mateuserp.sistemagestaodeobras.service.FuncionarioService;

@Controller
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService service;

    @RequestMapping("/cadastrar")
    public String cadastrar() {
        return "/funcionario/cadastro";
    }

    @RequestMapping("/listar")
    public String listar() {
        return "/funcionario/lista";
    }

    @PostMapping("/salvar")
    public String salvar(Funcionario funcionario){
        service.salvar(funcionario);
        return "redirect:/funcionarios/cadastrar";
    }
}
