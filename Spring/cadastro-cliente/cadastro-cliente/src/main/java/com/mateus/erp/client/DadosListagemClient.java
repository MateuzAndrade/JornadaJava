package com.mateus.erp.client;


public record DadosListagemClient(Long Id,String nome,String email,String telefone,String cpf,Atendimento atendimento) {

    public DadosListagemClient(Client client){
        this(client.getId(),client.getNome(), client.getEmail(), client.getTelefone(),client.getCpf(),client.getAtendimento());
    }

}
