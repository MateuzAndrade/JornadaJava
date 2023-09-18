package com.mateus.erp.controler;

import com.mateus.erp.client.Client;
import com.mateus.erp.client.ClientRepository;
import com.mateus.erp.client.DadosCadastroCliente;
import com.mateus.erp.client.DadosListagemClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("client")
public class ClienteControler {

    @Autowired
    private ClientRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroCliente dados){

        repository.save(new Client(dados));
    }

    @GetMapping
    public List<DadosListagemClient> Listar(){
        return repository.findAll().stream().map(DadosListagemClient::new);
    }

}
