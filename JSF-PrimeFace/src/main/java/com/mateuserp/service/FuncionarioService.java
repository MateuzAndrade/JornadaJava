package com.mateuserp.service;

import java.io.Serializable;

import javax.inject.Inject;

import com.mateuserp.model.Funcionario;
import com.mateuserp.repository.FuncionariosRepository;

public class FuncionarioService implements Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	public FuncionariosRepository funcionariosRepository;
	
	public void salvar(Funcionario funcionario) {
		funcionariosRepository.guardar(funcionario);
	}
	
	public void apagar(Funcionario funcionario) {
		funcionariosRepository.remover(funcionario);
	}
}
