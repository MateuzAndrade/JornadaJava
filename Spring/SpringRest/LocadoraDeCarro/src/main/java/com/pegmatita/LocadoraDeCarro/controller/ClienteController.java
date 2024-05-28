package com.pegmatita.LocadoraDeCarro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import com.pegmatita.LocadoraDeCarro.model.Cliente;
import com.pegmatita.LocadoraDeCarro.repository.ClienteRepository;

@Controller
@ResponseBody
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> listar(){
        return clienteRepository.findAll();
    }

}
