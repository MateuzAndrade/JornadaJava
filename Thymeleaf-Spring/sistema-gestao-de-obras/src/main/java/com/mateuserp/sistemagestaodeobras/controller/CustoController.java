package com.mateuserp.sistemagestaodeobras.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/custos")
public class CustoController {

    @RequestMapping("/cadastrar")
    public String cadastrar() {
        return "/custo/cadastro";
    }

    @RequestMapping("/listar")
    public String listar() {
        return "/custo/lista";
    }

}
