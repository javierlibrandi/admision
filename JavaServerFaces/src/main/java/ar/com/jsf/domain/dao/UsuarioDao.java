package ar.com.jsf.domain.dao;



import ar.com.jsf.domain.Usuario;

public interface UsuarioDao extends Dao<Usuario> {

	Usuario bucarUsuarioPorNamePassword(String username, String password);

}
