package ar.com.jsf.domain.dao;

public interface Dao<T> {
	T get(Long id);

	Long save(T entity);

	
	void delete(T entity);
}
