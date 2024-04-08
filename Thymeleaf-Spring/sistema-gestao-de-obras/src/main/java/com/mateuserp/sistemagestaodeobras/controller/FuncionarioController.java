package com.mateuserp.sistemagestaodeobras.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mateuserp.sistemagestaodeobras.model.Funcionario;

@Controller
@RequestMapping("/funcionarios")
public class FuncionarioController {


    @RequestMapping("/cadastrar")
    public String cadastrar(Funcionario funcionario) {
        return "/funcionario/cadastro";
    }

    @RequestMapping("/listar")
    public String listar() {
        return "/funcionario/lista";
    }

}
