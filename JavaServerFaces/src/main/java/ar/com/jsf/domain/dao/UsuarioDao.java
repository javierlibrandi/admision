package ar.com.jsf.domain.dao;



import java.util.List;

import ar.com.jsf.domain.Usuario;

public interface UsuarioDao extends Dao<Usuario> {

	Usuario findByUsuario(String usuario);
	List<Usuario> findAll();

}
