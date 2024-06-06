package com.pegmatita.Locadora.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.pegmatita.Locadora.model.locadoraDeCarroModel.Cliente;
import com.pegmatita.Locadora.repository.locadoradeCarroRepository.ClienteRepository;
import com.pegmatita.Locadora.service.locadoraDeCarroService.ClienteService;


@Controller
@ResponseBody
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private ClienteRepository clienteRepository;


    @GetMapping
    public List<Cliente> listar() {
        return clienteService.listar();
    }

    @GetMapping("/{clientesid}")
    public Cliente buscar(@PathVariable("clientesid") Long id) {
        return clienteService.buscar(id);

    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente criar(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }


    @DeleteMapping("/{clientesid}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void delete(@PathVariable("clientesid") Long id) {
        clienteRepository.deleteById(id);
    }
    
}
