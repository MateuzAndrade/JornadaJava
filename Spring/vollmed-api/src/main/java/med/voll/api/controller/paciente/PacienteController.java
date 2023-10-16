package med.voll.api.controller.paciente;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.model.paciente.DadosCadastroPaciente;
import med.voll.api.model.paciente.Paciente;
import med.voll.api.model.paciente.PacienteListar;
import med.voll.api.model.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pacientes")
public class PacienteController {
    @Autowired
    private PacienteRepository repositoryPaciente;

    @PostMapping
    @Transactional
    public void cadastrarPaciente(@RequestBody @Valid DadosCadastroPaciente dadosPacientes ){
        repositoryPaciente.save(new Paciente(dadosPacientes));
    }

    @GetMapping
    public Page<PacienteListar> listarPaciente(Pageable paginacao){
        return repositoryPaciente.findAll(paginacao).map(PacienteListar::new);
    }

    @PutMapping
    public void atualizarPaciente() {

    }
}
