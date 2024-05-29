package com.pegmatita.LocadoraDeCarro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pegmatita.LocadoraDeCarro.model.mariadb.Camisa;
import com.pegmatita.LocadoraDeCarro.repository.mariadb.CamisaRepository;

@Service
public class CamisaService {

    @Autowired
    private CamisaRepository camisaRepository;

    public List<Camisa> listar(){
       return camisaRepository.findAll();
    }

}
