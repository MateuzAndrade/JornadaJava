package com.pegmatita.controller;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pegmatita.model.Curso;
import com.pegmatita.repository.CursoRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/cursos")
@AllArgsConstructor
public class CursoController {

    
    private final CursoRepository cursoRepository;

    @GetMapping
    public List<Curso> lista(){
        return cursoRepository.findAll();
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