package med.voll.api.controller.paciente;

import med.voll.api.model.paciente.DadosCadastroPaciente;
import med.voll.api.model.paciente.Paciente;
import med.voll.api.model.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pacientes")
public class PacienteController {
    @Autowired
    private PacienteRepository repositoryPaciente;

    @PostMapping
    public void cadastrarPaciente(@RequestBody DadosCadastroPaciente dadosPacientes ){
        repositoryPaciente.save(new Paciente(dadosPacientes));
    }

    @GetMapping
    public void listarPaciente(){

    }

    @PutMapping
    public void atualizarPaciente() {

    }
}
