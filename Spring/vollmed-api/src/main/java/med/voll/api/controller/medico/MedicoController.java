package med.voll.api.controller.medico;

import med.voll.api.model.medico.DadosCadastroMedico;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @PostMapping
    public void cadastrarMedico(@RequestBody DadosCadastroMedico dadosMedico){

    }

    @GetMapping
    public void  listarMedico(){

    }

    @PutMapping
    public  void atualizarMedico(){

    }
}
