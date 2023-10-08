package med.voll.api.controller.medico;

import med.voll.api.model.medico.DadosCadastroMedico;
import med.voll.api.model.medico.Medico;
import med.voll.api.model.medico.MedicoRepository;
import med.voll.api.model.paciente.DadosCadastroPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("medicos")
public class MedicoController {
    @Autowired
    private MedicoRepository repositoryMedico;

    @PostMapping
    public void cadastrarMedico(@RequestBody DadosCadastroMedico dadosMedico ){
        repositoryMedico.save(new Medico(dadosMedico));

    }

    @GetMapping
    public void  listarMedico(){

    }

    @PutMapping
    public  void atualizarMedico(){

    }
}
