package org.alc.dao;

import java.io.Serializable;
import java.util.List;

import com.szczytowski.genericdao.criteria.Criteria;

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
    
    /**
     * Find object by criteria
     * @param criteria
     * @return
     */
    List<E> findByCriteria(Criteria criteria);
    
    /**
     * Find all objects in the repository
     * @return
     */
    List<E> findAll();
    
    /**
     * Find all objects in the repository by Example
     * @return
     */
    List<E> findByExample(E entity);
}
