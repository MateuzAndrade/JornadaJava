package com.mateuserp.sistemagestaodeobras.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cargos")
public class CargosController {

    @RequestMapping("/cadastrar")
    public String cadastrar() {
        return "/cargo/cadastro";
    }

    @RequestMapping("/listar")
    public String listar() {
        return "/cargo/lista";
    }
}
