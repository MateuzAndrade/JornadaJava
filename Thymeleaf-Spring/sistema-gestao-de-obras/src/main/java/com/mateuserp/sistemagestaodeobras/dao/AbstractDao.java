package com.mateuserp.sistemagestaodeobras.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

public abstract class AbstractDao<T, PK extends Serializable> {

	@PersistenceContext
	private EntityManager entityManager;

	private final Class<T> entityClass;

	@SuppressWarnings("unchecked")
	public AbstractDao() {
		this.entityClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass())
				.getActualTypeArguments()[0];
	}

	protected EntityManager getEntityManager() {
		return entityManager;
	}

	public void save(T entity) {
		entityManager.persist(entity);
	}

	public void update(T entity) {
		entityManager.merge(entity);
	}

	public void delete(PK id) {
		T reference = entityManager.getReference(entityClass, id);
		entityManager.remove(reference);
	}

	public T findById(PK id) {
		return entityManager.find(entityClass, id);
	}

	public List<T> findAll() {
		return entityManager.createQuery("from " + entityClass.getSimpleName(), entityClass)
				.getResultList();
	}

	protected List<T> createQuery(String jpql, Object... params) {
		TypedQuery<T> query = entityManager.createQuery(jpql, entityClass);
		for (int i = 0; i < params.length; i++) {
			query.setParameter(i + 1, params[i]);
		}
		return query.getResultList();
	}
}
