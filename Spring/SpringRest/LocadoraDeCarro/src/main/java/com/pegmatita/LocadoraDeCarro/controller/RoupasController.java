package com.pegmatita.LocadoraDeCarro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pegmatita.LocadoraDeCarro.model.mariadb.Camisa;
import com.pegmatita.LocadoraDeCarro.service.CamisaService;

@Controller
@ResponseBody
@RequestMapping("/roupas")
public class RoupasController {

    @Autowired
    private CamisaService camisaService;

    @GetMapping
    public  List<Camisa> listar(){
        return camisaService.listar();
    }
    
}
