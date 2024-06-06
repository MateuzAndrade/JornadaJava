package com.pegmatita.Locadora.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pegmatita.Locadora.model.locadoraDeRoupaModel.Camisa;
import com.pegmatita.Locadora.repository.locadoraDeRoupaRepository.CamisaRepository;

@RestController
@RequestMapping("/camisa")
public class CamisaController {

    @Autowired
    private CamisaRepository camisaRepository;

    @GetMapping
    public List<Camisa> listar() {
        return camisaRepository.findAll();
    }

    @PostMapping
    @Transactional
    public ResponseEntity<Camisa> criar(@RequestBody Camisa camisa) {
        try {
            System.out.println("Recebido: " + camisa);
            Camisa savedCamisa = camisaRepository.save(camisa);
            System.out.println("Salvo: " + savedCamisa);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedCamisa);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
