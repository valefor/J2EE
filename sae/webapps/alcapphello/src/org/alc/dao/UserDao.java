package org.alc.dao;

import java.util.List;

import org.alc.entity.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class UserDao {
	
	@PersistenceContext
	public EntityManager em;
	
	@Transactional(readOnly=true)
	public List<User> findAll() {
		Query query = em.createQuery("from User as o");
		List<User> result = query.getResultList();
		return result;
	}
	
	@Transactional(readOnly=true)
	public User findByName(String userName) {
		Query query = em.createQuery("select x from User x where x.name = '" +userName+ "' ");
		List<User> result = query.getResultList();
		if (!result.isEmpty()) {
			return result.get(0);
		}
		return null;
	}

	@Transactional
	public User save(User newUser) {
		em.persist(newUser);
		em.flush();
		return newUser;
	}
	
	@Transactional
	public User reload(User user) {
		return em.find(User.class, user.getId());
	}
	
	@Transactional
	public boolean isUserExist(String name) {
		return (findByName(name) == null)?false:true;
	}
}
