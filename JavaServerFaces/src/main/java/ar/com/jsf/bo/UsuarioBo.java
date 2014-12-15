package ar.com.jsf.bo;

import java.util.List;

import ar.com.jsf.domain.Usuario;

public interface UsuarioBo {

	public boolean ValidarUsuario(String username, String password);
	public Usuario getUsuario();
	public List <Usuario> getListUsuarios();

}
