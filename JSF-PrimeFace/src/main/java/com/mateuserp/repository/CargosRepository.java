package com.mateuserp.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.mateuserp.model.Cargo;

public class CargosRepository implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	public CargosRepository(EntityManager manager) {
		this.manager = manager;
	}

	public Cargo porId(Long id) {
		return manager.find(Cargo.class, id);
	}
	
	public List<Cargo> pesquisar (String nome){
		TypedQuery<Cargo> query = manager
				.createQuery("from Cargo where nome like :nome", Cargo.class);
		query.setParameter("nome", nome + "%");
		return query.getResultList();
	}
	
	public Cargo guardar (Cargo Cargo) {
		return manager.merge(Cargo);
	}
	
	public void remover (Cargo Cargo) {
		Cargo = porId(Cargo.getId());
		manager.remove(Cargo);
	
	}

}
