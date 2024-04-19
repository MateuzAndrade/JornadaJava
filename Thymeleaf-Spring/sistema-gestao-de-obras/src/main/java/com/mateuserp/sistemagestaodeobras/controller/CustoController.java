package com.mateuserp.sistemagestaodeobras.controller;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mateuserp.sistemagestaodeobras.model.Custo;
import com.mateuserp.sistemagestaodeobras.model.Obra;
import com.mateuserp.sistemagestaodeobras.repository.CustoRespository;
import com.mateuserp.sistemagestaodeobras.repository.ObraRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequestMapping("/custos")
public class CustoController {

    @Autowired
    CustoRespository custoRespository;

    @Autowired
    ObraRepository obraRepository;

    @RequestMapping("/cadastrar")
    public String cadastrar(Custo custo) {
        return "/custo/cadastro";
    }

    @RequestMapping("/listar")
    public String listar(ModelMap model) {
        model.addAttribute("custo", custoRespository.findAll());
        return "/custo/lista";
    }

    @ModelAttribute("obra")
    public List<Obra> getObra() {
        return obraRepository.findAll();
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Custo custo, RedirectAttributes attr) {
        LocalDate dataRecebida = custo.getData();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = dataRecebida.format(formatter);
        LocalDate dataAjustada = LocalDate.parse(dataFormatada, formatter);
        custo.setData(dataAjustada);
        custoRespository.save(custo);
        attr.addFlashAttribute("success", "Custo Inserido com Sucesso no Sistema");
        return "redirect:/custos/cadastrar";
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
