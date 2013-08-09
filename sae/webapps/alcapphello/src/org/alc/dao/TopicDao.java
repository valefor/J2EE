package org.alc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.alc.entity.Topic;
import org.alc.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class TopicDao {
	
	@PersistenceContext
	public EntityManager em;
	
	@Transactional(readOnly=true)
	public List<Topic> findAll() {
		Query query = em.createQuery("from User as o");
		List<Topic> result = query.getResultList();
		return result;
	}
	
	@Transactional
	public Topic save(Topic newTopic) {
		em.persist(newTopic);
		em.flush();
		return newTopic;
	}
	
	@Transactional
	public Topic reload(Topic topic) {
		return em.find(Topic.class, topic.getId());
	}

}
