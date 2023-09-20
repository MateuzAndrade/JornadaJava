package com.mateus.erp.client;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;


public record DadosListagemClient(

        String nome,

        String email,

        String cpf,

        String telefone,

        String atendimento
) {


}
