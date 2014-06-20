package org.alc.dao.impl;

import java.util.List;

import org.alc.entity.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class UserDao extends JpaGenericDao< User, Integer > {

	
	@Transactional(readOnly=true)
	public List<User> findAll() {
		Query query = entityManager.createQuery("from User as o");
		List<User> result = query.getResultList();
		return result;
	}
	
	@Transactional(readOnly=true)
	public User findByName(String userName) {
		Query query = entityManager.createQuery("select x from User x where x.name = '" +userName+ "' ");
		List<User> result = query.getResultList();
		if (!result.isEmpty()) {
			return result.get(0);
		}
		return null;
	}
	
	@Transactional
	public boolean isUserExist(String name) {
		return (findByName(name) == null)?false:true;
	}
}
