package com.mateuserp.sistemagestaodeobras.controller;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mateuserp.sistemagestaodeobras.model.CustoFolha;
import com.mateuserp.sistemagestaodeobras.model.Funcionario;
import com.mateuserp.sistemagestaodeobras.model.Obra;
import com.mateuserp.sistemagestaodeobras.repository.CustoFolhaRepository;
import com.mateuserp.sistemagestaodeobras.repository.FuncionarioRepository;
import com.mateuserp.sistemagestaodeobras.repository.ObraRepository;

@Controller
@RequestMapping("/custosFolha")

public class CustoFolhaController {

    @Autowired
    CustoFolhaRepository custoFolhaRepository;

    @Autowired
    ObraRepository obraRepository;

    @Autowired
    FuncionarioRepository funcionarioRepository;

    @ModelAttribute("obra")
    public List<Obra> getObra() {
        return obraRepository.findAll();
    }

    @ModelAttribute("funcionario")
    public List<Funcionario> getFuncionaroi() {
        return funcionarioRepository.findAll();
    }

    @RequestMapping("/cadastrar")
    public String cadastrar(CustoFolha custoFolha) {
        return "custoFolha/cadastro";
    }

    @RequestMapping("/listar")
    public String listar(ModelMap model) {
        model.addAttribute("custoFolha", custoFolhaRepository.findAll());
        return "custoFolha/lista";
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute CustoFolha custoFolha, RedirectAttributes attr) {
        LocalDate dataRecebida = custoFolha.getData();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = dataRecebida.format(formatter);
        LocalDate dataAjustada = LocalDate.parse(dataFormatada, formatter);
        custoFolha.setData(dataAjustada);
        custoFolhaRepository.save(custoFolha);
        attr.addFlashAttribute("success", "Custo da Folha Inserido com Sucesso no Sistema");
        return "redirect:/custosFolha/cadastrar";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator(',');
        df.setDecimalFormatSymbols(symbols);
        binder.registerCustomEditor(BigDecimal.class, new CustomNumberEditor(BigDecimal.class, df, true));
    }











}
