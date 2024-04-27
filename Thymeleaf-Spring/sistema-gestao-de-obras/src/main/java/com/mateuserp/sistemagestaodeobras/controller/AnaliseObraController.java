package com.mateuserp.sistemagestaodeobras.controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mateuserp.sistemagestaodeobras.model.Obra;
import com.mateuserp.sistemagestaodeobras.repository.CustoFolhaRepository;
import com.mateuserp.sistemagestaodeobras.repository.CustoRespository;
import com.mateuserp.sistemagestaodeobras.repository.ObraRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;


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

    @RequestMapping("/listar")
    public String listar(ModelMap model) {
        model.addAttribute("custo",custoRespository.findAll());
        model.addAttribute("custoFolha", custoFolhaRepository.findAll());
        return "analiseObra/lista";
    }
    

    @GetMapping("/resultado")
    public String resultado(@RequestParam(value = "obraId", required = false) Long obraId, Model model) {

        BigDecimal totalCustos;
        BigDecimal totalCustosFolha;

        if (obraId != null) {
            totalCustos = custoRespository.sumValorByObra(obraId);
            totalCustosFolha = custoFolhaRepository.sumValorByObra(obraId);
        } else {
            totalCustos = custoRespository.sumValor();
            totalCustosFolha = custoFolhaRepository.sumValor();
        }

        // Calculando o somatório das outras duas colunas
        BigDecimal total = totalCustos.add(totalCustosFolha);

        List<Obra> obra =  obraRepository.findAll();
        model.addAttribute("totalCustos", totalCustos);
        model.addAttribute("totalCustosFolha", totalCustosFolha);
        model.addAttribute("total", total); // Adicionando o somatório total

        return "analiseObra/resultado";
    }


    

}
