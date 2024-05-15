package com.pegmatita.controller;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pegmatita.model.Curso;
import com.pegmatita.repository.CursoRepository;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/cursos")
@AllArgsConstructor
public class CursoController {

    
    private final CursoRepository cursoRepository;

    @GetMapping
    public List<Curso> lista(){
        return cursoRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Curso criarCurso(@RequestBody Curso curso) {

        return cursoRepository.save(curso);
    }

    @Bean
    CommandLineRunner initDatabase(CursoRepository cursoRepository){
        return args -> {
            //deleta antes
            cursoRepository.deleteAll();
            //cria um novo
            Curso c = new Curso();
            c.setNome("Angular com Spring");
            c.setCategoria("Front-end");
            cursoRepository.save(c);
    };
}
}