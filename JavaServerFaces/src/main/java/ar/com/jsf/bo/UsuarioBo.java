package ar.com.jsf.bo;

import ar.com.jsf.domain.Usuario;

public interface UsuarioBo {

	public boolean ValidarUsuario(String username, String password);
	public Usuario getUsuario();

}
