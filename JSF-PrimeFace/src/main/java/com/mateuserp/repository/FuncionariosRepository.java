package com.mateuserp.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.mateuserp.model.Funcionario;

public class FuncionariosRepository implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	public FuncionariosRepository(EntityManager manager) {
		this.manager = manager;
	}

	public Funcionario porId(Long id) {
		return manager.find(Funcionario.class, id);
	}
	
	public List<Funcionario> pesquisar (String nome){
		TypedQuery<Funcionario> query = manager
				.createQuery("from Funcionario where nome like :nome", Funcionario.class);
		query.setParameter("nome", nome + "%");
		return query.getResultList();
	}
	
	public Funcionario guardar (Funcionario Funcionario) {
		return manager.merge(Funcionario);
	}
	
	public void remover (Funcionario Funcionario) {
		Funcionario = porId(Funcionario.getId());
		manager.remove(Funcionario);
	
	}
}
