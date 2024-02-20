package com.mateuz.andrade.ConsumindoAPI.controler;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mateuz.andrade.ConsumindoAPI.service.OMbApiService;

@Controller
@RequestMapping("/consultar-filme")
public class ConsultaFilmeController {
	
	private final OMbApiService omDbApiService;

    public ConsultaFilmeController(OMbApiService omDbApiService) {
        this.omDbApiService = omDbApiService;
    }

    @PostMapping
    public String consultarFilme(ConsultaForm consultaForm, Model model) {

        return "ConsultaDadosFilme";
    }
}
