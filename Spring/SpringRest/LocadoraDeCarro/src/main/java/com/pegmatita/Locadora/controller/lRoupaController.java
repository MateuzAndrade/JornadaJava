package com.pegmatita.Locadora.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pegmatita.Locadora.model.locadoraDeRoupaModel.Roupa;
import com.pegmatita.Locadora.repository.locadoraDeRoupaRepository.RoupaRepository;





@RestController
@RequestMapping(value="roupa")
public class lRoupaController {

    @Autowired
    private RoupaRepository roupaRepository;

    @GetMapping
    public List<Roupa> listar(){
        return roupaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Roupa> buscarRoupaId(@PathVariable("id") Long id) {
        Optional<Roupa> roupa = roupaRepository.findById(id);

        if (roupa.isPresent()) {
            return ResponseEntity.ok(roupa.get());
        }
        return ResponseEntity.notFound().build();

    }

    @PostMapping
    public Roupa criar(@RequestBody Roupa roupa) {        
        return roupaRepository.save(roupa);
    }   
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Roupa> deletarRoupa(@PathVariable("id") Long id){
        if (roupaRepository.existsById(id)) {
            roupaRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Roupa> atualizarRoupa(@PathVariable("id") Long id, @RequestBody Roupa entity) {
        Optional<Roupa> roupa = roupaRepository.findById(id);

        if (roupa.isPresent()) {
            Roupa roupaAntiga = roupa.get();
            BeanUtils.copyProperties(entity, roupaAntiga, "id");
            Roupa roupaAtualizada = roupaRepository.save(roupaAntiga);
            return ResponseEntity.ok(roupaAtualizada);
        }
        return ResponseEntity.notFound().build();
    }
}
