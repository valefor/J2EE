package org.alc.dao.impl;

import java.util.List;

import org.alc.entity.*;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.szczytowski.genericdao.criteria.Criteria;
import com.szczytowski.genericdao.criteria.restriction.Restrictions;


@Repository
public class UserDao extends JpaGenericDao< User, Integer > {

	@Transactional(readOnly=true)
	public User findByName(String userName) {
		//Query query = entityManager.createQuery("select x from User x where x.name = '" +userName+ "' ");
		Criteria criteria = Criteria.forClass(User.class);
		criteria.add(Restrictions.eq("name", userName));
		List<User> result = findByCriteria(criteria);
		if (!result.isEmpty()) {
			return result.get(0);
		}
		return null;
	}
	
	/**
	 * Should cache query result to elevate capacity
	 * @param name
	 * @return
	 */
	public boolean isUserExist(String name) {
		return (findByName(name) == null)?false:true;
	}
}
