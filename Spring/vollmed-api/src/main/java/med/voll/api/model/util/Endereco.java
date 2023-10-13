package med.voll.api.model.util;

import jakarta.validation.constraints.NotBlank;

public record Endereco(
        @NotBlank
        String logradouro,
        @NotBlank
        String numero,
        @NotBlank
        String complemento,
        @NotBlank
        String bairro,
        @NotBlank
        String cidade,
        @NotBlank
        String UF,
        @NotBlank
        String cep
) {
}
