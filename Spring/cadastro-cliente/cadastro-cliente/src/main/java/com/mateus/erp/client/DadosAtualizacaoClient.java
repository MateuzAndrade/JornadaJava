package com.mateus.erp.client;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoClient(
        @NotNull
        Long id,
        String telefone,
        Atendimento atendimento) {


}
