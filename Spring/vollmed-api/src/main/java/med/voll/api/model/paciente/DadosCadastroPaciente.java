package med.voll.api.model.paciente;

import med.voll.api.model.Endereco;

public record DadosCadastroPaciente(String nome, String email, int telefone, String CPF, Endereco endereco) 
{
}
