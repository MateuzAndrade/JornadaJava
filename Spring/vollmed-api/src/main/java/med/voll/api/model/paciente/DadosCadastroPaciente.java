package med.voll.api.model.paciente;

import med.voll.api.model.util.Endereco;

public record DadosCadastroPaciente(String nome, String email, String telefone, String CPF, Endereco endereco)
{
}
