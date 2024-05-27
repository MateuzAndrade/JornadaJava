package pegmatita.com.LocadoraDeCarros.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cadastro")
public class CadastroController {

	@RequestMapping("/carro")
	public String carroCadastro() {
		return "cadastro/CadastroCarro";
	}
}
