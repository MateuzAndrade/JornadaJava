package com.mateus.erp.client;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record DadosCadastroCliente(
        @NotBlank
        String nome,
        @NotBlank@Email
        String email,
        @NotBlank
        String cpf,
        @NotBlank
        String telefone,
        @NotBlank
        Atendimento atendimento
        ) {
}
