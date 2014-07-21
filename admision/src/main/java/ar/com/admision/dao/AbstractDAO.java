package ar.com.admision.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractDAO<T>  implements DAO<T>{
	
	private SessionFactory sessionFactory;

	@Autowired
	protected void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory  = sessionFactory;
	}	
	
	protected Session currentSession(){
		return this.sessionFactory.getCurrentSession();
	}
	
	public T get(Long id) {	
		return (T) currentSession().load(getEntityClass(), id);
	}

	
	public Long save(T entity) {	
		return (Long) currentSession().save(entity);
	}

	
	
	public void delete(T entity) {	
		currentSession().delete(entity);
	}


	
	public abstract Class<T> getEntityClass();
}

