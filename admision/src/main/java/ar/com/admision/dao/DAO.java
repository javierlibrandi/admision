package ar.com.admision.dao;

public interface DAO<T> {
	
	T get(Long id);

	Long save(T entity);

	
	void delete(T entity);

}

