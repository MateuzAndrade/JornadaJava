package pegmatita.com.LocadoraDeCarros.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import pegmatita.com.LocadoraDeCarros.model.Carro;
import pegmatita.com.LocadoraDeCarros.repository.CarroRepository;

@Service
public class CarroService {
	
	@Autowired
	private Carro carro;
	
	@Autowired
	private CarroRepository carroRepository;
	
	private List<Carro> getCarros(){
		return carroRepository.findAll();
	}
	
	private Carro saveCarro(@RequestBody Carro carro) {
		return carroRepository.save(carro);
	}

}
