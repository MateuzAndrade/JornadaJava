package com.mateuserp.sistemagestaodeobras.controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mateuserp.sistemagestaodeobras.model.Obra;
import com.mateuserp.sistemagestaodeobras.repository.CustoFolhaRepository;
import com.mateuserp.sistemagestaodeobras.repository.CustoRespository;
import com.mateuserp.sistemagestaodeobras.repository.ObraRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
@RequestMapping("/analiseObra")
public class AnaliseObraController {
    
    @Autowired
    CustoFolhaRepository custoFolhaRepository;

    @Autowired
    CustoRespository custoRespository;

    @Autowired
    ObraRepository obraRepository;

    @ModelAttribute("obra")
    public List<Obra> getObra() {
        return obraRepository.findAll();
    }

    @GetMapping("/resultado")
    public String resultado(Model model) {

        BigDecimal totalCustos = custoRespository.sumValor();
        BigDecimal totalCustosFolha = custoFolhaRepository.sumValor();

        model.addAttribute("totalCustos", totalCustos);
        model.addAttribute("totalCustosFolha", totalCustosFolha);


        return"analiseObra/resultado";
    }
    

}
