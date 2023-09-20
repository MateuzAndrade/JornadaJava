package com.mateus.erp.controler;

import com.mateus.erp.client.Client;
import com.mateus.erp.client.ClientRepository;
import com.mateus.erp.client.DadosCadastroCliente;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("client")
public class ClienteControler {

    @Autowired
    private ClientRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody @Valid DadosCadastroCliente dados){

        repository.save(new Client(dados));
    }


}
