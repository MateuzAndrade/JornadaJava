package med.voll.api.model.paciente;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Paciente")
@Table(name = "paciente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Paciente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String email;
    private String telefone;
    private String CPF;
    @Embedded
    private EnderecoPaciente endereco;

    public Paciente(DadosCadastroPaciente dadosPacientes) {
        this.nome = dadosPacientes.nome();
        this.email = dadosPacientes.email();
        this.telefone = dadosPacientes.telefone();
        this.CPF = dadosPacientes.CPF();
        this.endereco = new EnderecoPaciente(dadosPacientes.endereco());

    }
}
