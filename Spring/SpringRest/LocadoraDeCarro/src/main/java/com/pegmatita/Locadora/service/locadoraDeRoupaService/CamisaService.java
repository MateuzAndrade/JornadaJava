package com.pegmatita.Locadora.service.locadoraDeRoupaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pegmatita.Locadora.repository.locadoraDeRoupaRepository.CamisaRepository;

@Service
public class CamisaService {

    @Autowired
    private CamisaRepository camisaRepository;

}
