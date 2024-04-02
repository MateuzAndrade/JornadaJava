package com.mateuserp.sistemagestaodeobras.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/obras")
public class ObrasController {

        @RequestMapping("/cadastrar")
    public String cadastrar() {
        return "/obra/cadastro";
    }

    @RequestMapping("/listar")
    public String listar() {
        return "/obra/lista";
    }
}
