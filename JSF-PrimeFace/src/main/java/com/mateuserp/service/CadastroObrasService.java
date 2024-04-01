package com.mateuserp.service;

import java.io.Serializable;

import javax.inject.Inject;

import com.mateuserp.model.Obra;
import com.mateuserp.repository.ObrasRepository;

public class CadastroObrasService implements Serializable {


	private static final long serialVersionUID = 1L;
	
	@Inject
	private ObrasRepository obrasRepository;
	
	public void salvar (Obra obra) {
		obrasRepository.guardar(obra);
	}
	
	private void excluir (Obra obra) {
		obrasRepository.remover(obra);
	}

}
