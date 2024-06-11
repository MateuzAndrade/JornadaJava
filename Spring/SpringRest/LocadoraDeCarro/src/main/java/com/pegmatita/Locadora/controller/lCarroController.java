package com.pegmatita.Locadora.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pegmatita.Locadora.model.locadoraDeCarroModel.Carro;
import com.pegmatita.Locadora.repository.locadoradeCarroRepository.CarroRepository;




@RestController
@RequestMapping(value ="/carro")
public class lCarroController {

    @Autowired
    private CarroRepository carroRepository;


    @GetMapping
    public List<Carro> listar() {
        return carroRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Carro> buscaCarroId(@PathVariable ("id") Long id ) {
        Optional<Carro> carro = carroRepository.findById(id);
        
        if(carro.isPresent()){
            return ResponseEntity.ok(carro.get());
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/por-nome")
    public List<Carro> buscaCarroMarca(String marca ) {
        return carroRepository.findByMarca(marca);
    }
    

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Carro criar(@RequestBody Carro carro) {
        return carroRepository.save(carro);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Carro> removerCarro(@PathVariable("id") Long id){
        if (carroRepository.existsById(id)) {
            carroRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }else{
            return  ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Carro> atualizaCarro(@PathVariable("id") Long id, @RequestBody Carro entity) {
        Optional<Carro> carro = carroRepository.findById(id);

        if (carro.isPresent()) {
            Carro carroAntigo = carro.get();
            BeanUtils.copyProperties(entity, carroAntigo,"id");
            Carro carroAtualizado = carroRepository.save(carroAntigo);
            return ResponseEntity.ok(carroAtualizado);
        }

        return ResponseEntity.notFound().build();

    }
    

}
