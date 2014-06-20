package org.alc.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.alc.dao.DaoUtils;
import org.alc.dao.GenericDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Don't forgot to put @Transactional before each method
 * 
 * @author ehuufei
 *
 * @param <E>
 * @param <I>
 */
public class JpaGenericDao<E, I extends Serializable> implements GenericDao<E, I> {
	protected Class entityClass;
	
	@PersistenceContext
	protected EntityManager entityManager;
	
	@Autowired
	protected DaoUtils daoUtils;

	public JpaGenericDao() {
		System.out.println(getClass().getGenericSuperclass());
		ParameterizedType genericSuperclass = (ParameterizedType) getClass().getSuperclass().getGenericSuperclass();
		//this.entityClass = (Class) genericSuperclass.getActualTypeArguments()[1];
	}

	@Override
	@Transactional
	public E persist(E entity) {
		entityManager.persist(entity);
		return entity;
	}

	@Override
	@Transactional
	public E remove(E entity) {
		entityManager.remove(entity);
		return entity;
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public E findById(I id) {
		return (E) entityManager.find(entityClass, id);
	}

	@Override
	@Transactional
	public E save(E entity) {
		if(daoUtils.getId(entity)!=null) {
			return entityManager.merge(entity);
		} else {
			entityManager.persist(entity);
			return entity;
		}
	}
	
	
}
