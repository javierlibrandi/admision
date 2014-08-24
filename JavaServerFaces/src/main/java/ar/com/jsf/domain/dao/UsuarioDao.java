package ar.com.jsf.domain.dao;



import ar.com.jsf.domain.Usuario;

public interface UsuarioDao extends Dao<Usuario> {

	Usuario findByUsuario(String usuario);
//	Usuario findByUsurio(Usuario usuario);
//	Usuario	login(Usuario ususuario);

}
