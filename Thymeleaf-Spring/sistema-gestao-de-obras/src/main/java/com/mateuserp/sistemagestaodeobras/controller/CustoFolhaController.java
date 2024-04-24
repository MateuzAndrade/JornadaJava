package com.mateuserp.sistemagestaodeobras.controller;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/editar/{id}")
    public String preEditar(@PathVariable("id") Long id, ModelMap model) {
        Optional<CustoFolha> cusOptional = custoFolhaRepository.findById(id);
        CustoFolha custoFolha = cusOptional.get();
        model.addAttribute("custoFolha", custoFolha);
        return "custoFolha/cadastro";
    }

    @PostMapping("/editar")
    public String editar(CustoFolha custoFolha, RedirectAttributes attr) {
        custoFolhaRepository.save(custoFolha);
        attr.addAttribute("success", "Custo da FOlha Editado com Sucesso!");
        return "redirect:/custosFolha/listar";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable("id") Long id, ModelMap model) {
        custoFolhaRepository.deleteById(id);
        model.addAttribute("success", "Custo da Folha excluído com sucesso");
        return listar(model);
    }

    @GetMapping("/buscar/descricao")
    public String getDescricao(@RequestParam("descricao") String descricao, ModelMap model) {
        model.addAttribute("custoFolha", custoFolhaRepository.findByDescricaoContaining(descricao));
        return "custoFolha/lista";
    }

    @GetMapping("/buscar/obra")
    public String getPorObra(@RequestParam(name = "id", required = false) Long id, ModelMap model) {
        if (id != null) {
            Optional<Obra> obrOptional = obraRepository.findById(id);
            Obra obra = obrOptional.get();
            model.addAttribute("obra", obra);
            List<CustoFolha> custosDaObra = custoFolhaRepository.findByObra(obra);
            model.addAttribute("custoFolha", custosDaObra);
        } else {
            return "redirect:/custosFolha/listar";
        }
        return "custoFolha/lista";
    }

}
