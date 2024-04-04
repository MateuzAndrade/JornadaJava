package com.mateuserp.sistemagestaodeobras.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/analiseObra")
public class AnaliseObraController {

    @GetMapping("/resultado")
    public String resultado() {
        return"/analiseObra/resultado";
    }
    

}