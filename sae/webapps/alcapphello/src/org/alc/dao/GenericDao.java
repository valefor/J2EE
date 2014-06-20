package org.alc.dao;

import java.io.Serializable;

public interface GenericDao<E, I extends Serializable> {

	/** 
	 * Persist the newInstance object into database 
	 */
	E persist(E entity);
	
	/** 
	 * Remove an object from persistent storage in the database 
	 */
	E remove(E entity);
	
	/** 
	 * Retrieve an object that was previously persisted to the database by identifier
	 */
	E findById(I id);
	
	/** Save changes made to a persistent object.  */
    E save(E entity);
}
