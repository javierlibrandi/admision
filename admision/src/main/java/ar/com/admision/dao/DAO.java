package ar.com.admision.dao;

public interface DAO<T, ID> {
	
	T get(Long id);

	T save(T entity);
	
	void delete(T entity);

}

