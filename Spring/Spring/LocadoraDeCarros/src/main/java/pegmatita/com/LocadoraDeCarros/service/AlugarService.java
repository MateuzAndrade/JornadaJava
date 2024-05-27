package pegmatita.com.LocadoraDeCarros.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pegmatita.com.LocadoraDeCarros.model.Alugar;
import pegmatita.com.LocadoraDeCarros.repository.AlugarRepository;

@Service
public class AlugarService {

	@Autowired
	private AlugarRepository alugarRepository;
	
	@Autowired
	private Alugar alugar;
	
	
	
}
