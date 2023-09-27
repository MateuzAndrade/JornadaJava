package com.mateus.erp.controler;

import com.mateus.erp.client.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("client")
public class ClienteControler {

    @Autowired
    private ClientRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroCliente dados){

        repository.save(new Client(dados));
    }

    @GetMapping
    public Page<DadosListagemClient> listar(Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemClient::new);
    }

    @PutMapping
    @Transactional
    public  void atualizar(@RequestBody @Valid DadosAtualizacaoClient dados){
        var cliente = repository.getReferenceById(dados.id());
        cliente.atualizarInformacoes(dados);

    }

}
