package ar.com.admision.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;


/**
 * http://sobrejava.com/articulos/ejemplo-de-dao-generico-con-jpa
 * http://damianmigo.wordpress.com/2010/07/07/tutorial-jpa-hibernate-spring-orm-usando-eclipse/
 * @author B027208
 *
 * @param <T>
 * @param <ID>
 */
public abstract class AbstractDAO<T, ID extends Serializable>  implements DAO<T,ID>{
	
	@PersistenceContext
	protected EntityManager em;
	EntityManagerFactory emf;
	
	protected Class<T> classType;

	   public AbstractDAO() {
	        super();
	        this.emf = Persistence.createEntityManagerFactory("admision");
	        this.em = emf.createEntityManager();
	        this.classType = (Class<T>)getParameterClass(getClass(), 0);
	    }
	
	
	    public T save(T entity) {
	        this.em.persist(entity);
	        return entity;
	    }

	    public T update(T entity) {
	        return this.em.merge(entity);
	    }

	    public void delete(T entity) {
	        this.em.remove(entity);
	    }

	    public T findById(ID key) {
	        return this.em.find(classType, key);
	    }

	    private static Class<?> getParameterClass(Class<?> clazz, int index) {
	        return (Class<?>)(((ParameterizedType)clazz.getGenericSuperclass()).getActualTypeArguments()[index]);
	    }
	}
