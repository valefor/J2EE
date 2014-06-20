package org.alc.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Component;

/**
 * This DaoUtils class provides some util functions, mark it as @Component
 * for generic purpose.
 * 
 * @author ehuufei
 */
@Component
public class DaoUtils {

	private EntityManagerFactory emf;

	@PersistenceUnit
	public void setEntityManagerFactory(EntityManagerFactory emf) {
		this.emf = emf;
	}
	
	public Object getId(Object entity) {
		return emf.getPersistenceUnitUtil().getIdentifier(entity);
	}
	
}
