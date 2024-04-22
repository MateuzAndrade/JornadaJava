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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mateuserp.sistemagestaodeobras.model.Custo;
import com.mateuserp.sistemagestaodeobras.model.Obra;
import com.mateuserp.sistemagestaodeobras.repository.CustoRespository;
import com.mateuserp.sistemagestaodeobras.repository.ObraRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/custos")
public class CustoController {

    @Autowired
    CustoRespository custoRespository;

    @Autowired
    ObraRepository obraRepository;

    @RequestMapping("/cadastrar")
    public String cadastrar(Custo custo) {
        return "custo/cadastro";
    }

    @RequestMapping("/listar")
    public String listar(ModelMap model) {
        model.addAttribute("custo", custoRespository.findAll());
        return "custo/lista";
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

    @GetMapping("/editar/{id}")
    public String preEditar(@PathVariable("id") Long id, ModelMap model) {
        Optional<Custo> cusOptional = custoRespository.findById(id);
        Custo custo = cusOptional.get();
        model.addAttribute("custo", custo);
        return "custo/cadastro";
    }

    @PostMapping("/editar")
    public String editar(Custo custo, RedirectAttributes attr) {
        custoRespository.save(custo);
        attr.addAttribute("success", "Custo Editado com Sucesso!");
        return "redirect:/custos/listar";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable("id") Long id, ModelMap model) {
        custoRespository.deleteById(id);
        model.addAttribute("success", "Custo excluído com sucesso");
        return listar(model);
    }

    @GetMapping("/buscar/descricao")
    public String getDescricao(@RequestParam("descricao") String descricao, ModelMap model) {
        model.addAttribute("custo", custoRespository.findByDescricaoContaining(descricao));
        return "custo/lista";
    }

    @GetMapping("/buscar/obra")
    public String getPorObra(@RequestParam(name = "id", required = false) Long id, ModelMap model) {
        if (id != null) {
            Optional<Obra> obrOptional = obraRepository.findById(id);
            if (obrOptional.isPresent()) {
                Obra obra = obrOptional.get();
                List<Custo> custosDaObra = custoRespository.findByObra(obra);
                model.addAttribute("obra", obra);
                model.addAttribute("custo", custosDaObra);
            }
        } else {
            return "redirect:/custos/listar";
        }
        return "custo/lista";
    }

}
