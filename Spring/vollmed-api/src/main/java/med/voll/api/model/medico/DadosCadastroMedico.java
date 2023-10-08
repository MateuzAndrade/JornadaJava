package med.voll.api.model.medico;

import med.voll.api.model.util.Endereco;

public record DadosCadastroMedico(String nome, String email, String telefone, String CRM, Especialidade especialidade ,
                                  Endereco endereco) {
}
