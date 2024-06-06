package com.pegmatita.Locadora.service.locadoraDeCarroService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pegmatita.Locadora.model.locadoraDeCarroModel.Cliente;
import com.pegmatita.Locadora.repository.locadoradeCarroRepository.ClienteRepository;

import java.util.Collections;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private Cliente cliente;

    public List<Cliente> listar(){
       try {
           return clienteRepository.findAll();
       } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList();
       }

    }

    public Cliente buscar(Long id) {
        Optional<Cliente> clienteOpt = clienteRepository.findById(id);
        return clienteOpt.orElse(null); // ou lançar uma exceção, se apropriado
    }

}
