package med.voll.api.model.medico;

import med.voll.api.model.Endereco;

public record DadosCadastroMedico(String nome, String email, int telefone, String CRM,Especialidade especialidade ,Endereco endereco) {
}
