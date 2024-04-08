package com.mateuserp.sistemagestaodeobras.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mateuserp.sistemagestaodeobras.model.Cargo;
import com.mateuserp.sistemagestaodeobras.repository.CargoRespository;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping("/cargos")
public class CargosController {

    @Autowired
    CargoRespository cargoRespository;

    @RequestMapping("/cadastrar")
    public String cadastrar(Cargo cargo) {
        return "/cargo/cadastro";
    }

    @RequestMapping("/listar")
    public String listar() {
        return "/cargo/lista";
    }

    @PostMapping("/salvar")
    private String salvar(Cargo cargo, RedirectAttributes attr){
        cargoRespository.save(cargo);
        attr.addFlashAttribute("Sucesso", "Cargo Inserido com Sucesso no Sistema");
        return "redirect:/cargos/cadastrar";
    }

}
