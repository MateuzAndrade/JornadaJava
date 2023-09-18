package com.mateus.erp.client;

public record DadosListagemClient(String nome, String email, String telefone, String atendimento) {
    public DadosListagemClient(Client client){
        this(client.getNome(),client.getEmail(),client.getTelefone(),client.getAtendimento());
    }

}
