package ar.com.admision.dao;

import java.io.Serializable;

public interface DAO<T,ID extends Serializable> {
	

	void delete(T entity);

	T save(T entity);

	T update(T entity);
	
	T findById(ID key);

}

