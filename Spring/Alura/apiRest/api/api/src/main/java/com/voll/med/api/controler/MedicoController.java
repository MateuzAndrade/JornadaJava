package com.voll.med.api.controler;

import com.voll.med.api.medico.DadosCadastroMedico;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedico dados){

        System.out.println(dados);
    };

}
