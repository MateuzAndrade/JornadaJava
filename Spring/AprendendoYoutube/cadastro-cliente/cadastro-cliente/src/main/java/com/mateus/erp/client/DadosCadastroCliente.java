package com.mateus.erp.client;

import com.mateus.erp.endereco.DadosEndereco;

public record DadosCadastroCliente(
        String nome,
        String email,
        String telefone,
        String cpf,
        Atendimento atendimento
        , DadosEndereco endereco) {
}
