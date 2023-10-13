package med.voll.api.controller.medico;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.model.medico.DadosCadastroMedico;
import med.voll.api.model.medico.Medico;
import med.voll.api.model.medico.MedicoListar;
import med.voll.api.model.medico.MedicoRepository;
import med.voll.api.model.paciente.DadosCadastroPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("medicos")
public class MedicoController {
    @Autowired
    private MedicoRepository repositoryMedico;

    @PostMapping
    @Transactional
    public void cadastrarMedico(@RequestBody @Valid DadosCadastroMedico dadosMedico ){
        repositoryMedico.save(new Medico(dadosMedico));

    }

    @GetMapping
    public List<MedicoListar> listarMedico(){
        return repositoryMedico.findAll().stream().map(MedicoListar::new).toList();
    }

    @PutMapping
    public  void atualizarMedico(){

    }
}
