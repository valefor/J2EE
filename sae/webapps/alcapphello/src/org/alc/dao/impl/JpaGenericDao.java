package org.alc.dao.impl;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.alc.dao.DaoUtils;
import org.alc.dao.GenericDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.szczytowski.genericdao.criteria.Criteria;
import com.szczytowski.genericdao.criteria.restriction.Restrictions;

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

	/**
	 * Be careful since this JpaGenericDao will be the superclass of XXXDao,
	 * and cglib AOP implementation will inherit the XXXDao,the getClass will be 
	 * the proxied XXXDaoProxy class instead of XXXDao 
	 */
	public JpaGenericDao() {
		Class cls = getClass();
		while ( cls != null && cls.getSuperclass() != JpaGenericDao.class) cls = cls.getSuperclass();
		ParameterizedType genericSuperclass = (ParameterizedType)cls.getGenericSuperclass();
		this.entityClass = (Class) genericSuperclass.getActualTypeArguments()[0];
		// System.out.println(">>>>DEBUG:"+entityClass);
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
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional(readOnly=true)
	public E findById(I id) {
		return (E) entityManager.find(entityClass, id);
	}

	@SuppressWarnings(value = "unchecked")
	@Override
	@Transactional(readOnly=true)
	public List<E> findAll() {
		return findByCriteria(Criteria.forClass(entityClass));
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional(readOnly=true)
	public List<E> findByCriteria(Criteria criteria) {
		return criteria.list(entityManager);
	}

	@Override
	@Transactional(readOnly=true)
	public List<E> findByExample(E entity) {
		Criteria criteria = Criteria.forClass(entityClass);
		E rawEntity = null;
		// Using java reflection to read field of entity
		// the value of these fields will be the criteria for
		// query
		Field[] fields = entity.getClass().getDeclaredFields();
		for (Field field : fields) {
			Object value = null;
			Object rawValue = null;
			// Ignore serialVersionUID
			if (field.getName() == "serialVersionUID") continue;
			
			try {
				rawEntity = (E)entityClass.newInstance();
				field.setAccessible(true);
				value = field.get(entity);
				rawValue = field.get(rawEntity);
			} catch (IllegalArgumentException e) {
				continue;
			} catch (IllegalAccessException e) {
				continue;
			} catch (InstantiationException e) {
				continue;
			}

			if (value == null || value.equals(rawValue)) {
				continue;
			}

			//System.out.println(field.getName()+":"+value);
			criteria.add(Restrictions.eq(field.getName(), value));
		}
		return findByCriteria(criteria);
	}
	
}
