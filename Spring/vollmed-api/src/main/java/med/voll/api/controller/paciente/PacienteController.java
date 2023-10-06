package med.voll.api.controller.paciente;

import med.voll.api.model.paciente.DadosCadastroPaciente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

    @PostMapping
    public void cadastrarPaciente(@RequestBody DadosCadastroPaciente dados ){

    }

    @GetMapping
    public void listarPaciente(){

    }

    @PutMapping
    public void atualizarPaciente() {

    }
}
