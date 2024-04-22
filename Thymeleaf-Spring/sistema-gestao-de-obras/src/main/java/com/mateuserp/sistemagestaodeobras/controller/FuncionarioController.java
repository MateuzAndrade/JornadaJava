package com.mateuserp.sistemagestaodeobras.controller;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mateuserp.sistemagestaodeobras.model.Cargo;
import com.mateuserp.sistemagestaodeobras.model.Funcionario;
import com.mateuserp.sistemagestaodeobras.repository.CargoRespository;
import com.mateuserp.sistemagestaodeobras.repository.FuncionarioRepository;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    FuncionarioRepository funcionarioRepository;
    @Autowired
    CargoRespository cargoRespository;

    @RequestMapping("/cadastrar")
    public String cadastrar(Funcionario funcionario) {
        return "funcionario/cadastro";
    }

    @RequestMapping("/listar")
    public String listar(ModelMap model) {
        model.addAttribute("funcionarios", funcionarioRepository.findAll());
        return "funcionario/lista";
    }

    @PostMapping("/salvar")
    public String salvar(Funcionario funcionario, RedirectAttributes attr) {
        funcionarioRepository.save(funcionario);
        attr.addFlashAttribute("success", "Funcionário Inserido com Sucesso no Sistema");
        return "redirect:/funcionarios/cadastrar";
    }


    @ModelAttribute("cargos")
    public List<Cargo> getCargos() {
        return cargoRespository.findAll();
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
        Optional<Funcionario> funcionarioOptional = funcionarioRepository.findById(id);
        Funcionario funcionario = funcionarioOptional.get();
        model.addAttribute("funcionario", funcionario);
        return "funcionario/cadastro";
    }

    @PostMapping("/editar")
    public String editar(Funcionario funcionario, RedirectAttributes attr) {
        funcionarioRepository.save(funcionario);
        attr.addAttribute("success", "Funcionário Editado com Sucesso!");
        return "redirect:/funcionarios/listar";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable("id") Long id , ModelMap model) {
        funcionarioRepository.deleteById(id);
        model.addAttribute("success", "Funcionário excluído com sucesso");
        return listar(model);
    }
    
    
    

}
