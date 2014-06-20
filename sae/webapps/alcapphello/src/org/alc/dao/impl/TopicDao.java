package org.alc.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.alc.entity.Topic;
import org.alc.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class TopicDao extends JpaGenericDao< Topic, Integer > {
	
	@Transactional(readOnly=true)
	public List<Topic> findAll() {
		Query query = entityManager.createQuery("from Topic as o");
		List<Topic> result = query.getResultList();
		return result;
	}
	
}
