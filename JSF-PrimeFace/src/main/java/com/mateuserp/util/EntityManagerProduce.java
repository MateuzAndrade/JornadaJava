package com.mateuserp.util;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ApplicationScoped
public class EntityManagerProduce {

	private EntityManagerFactory factory;
	
	private EntityManagerProduce() {
		this.factory = Persistence.createEntityManagerFactory("mateuerp");		
	}
	
	@Produces
	public EntityManager createEntityManager() {
		return this.factory.createEntityManager();
	}
	
	public void closeEntityManager(@Disposes EntityManager manager) {
		manager.close();
	}
	
}
