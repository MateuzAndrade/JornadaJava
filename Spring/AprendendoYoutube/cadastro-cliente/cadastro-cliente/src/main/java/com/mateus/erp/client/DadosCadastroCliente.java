package com.mateus.erp.client;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroCliente(
        @NotBlank
        String nome,
        @NotBlank@Email
        String email,
        @NotBlank
        @Pattern(regexp = "\\d{0,11}")
        String cpf,
        @NotBlank
        String telefone,

        String atendimento
        ) {
}
