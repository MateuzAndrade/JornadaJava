package med.voll.api.controller.medico;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.model.medico.DadosCadastroMedico;
import med.voll.api.model.medico.Medico;
import med.voll.api.model.medico.MedicoListar;
import med.voll.api.model.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

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
    public Page<MedicoListar> listarMedico(Pageable paginacaoMedico){
        return repositoryMedico.findAll(paginacaoMedico).map(MedicoListar::new);
    }

    @PutMapping
    public  void atualizarMedico(){

    }
}
