package com.mateuserp.repository;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.mateuserp.model.Obra;

public class ObrasRepository implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private EntityManager manager;
	
	public ObrasRepository(EntityManager manager) {
		this.manager = manager;
	}

	public Obra porId(Long id) {
		return manager.find(Obra.class, id);
	}
	
	public List<Obra> pesquisar (String nome){
		TypedQuery<Obra> query = manager
				.createQuery("from Obra where nome like :nome", Obra.class);
		query.setParameter("nome", nome + "%");
		return query.getResultList();
	}
	
	public Obra guardar (Obra obra) {
		return manager.merge(obra);
	}
	
	public void remover (Obra obra) {
		obra = porId(obra.getId());
		manager.remove(obra);
	
	}

}
