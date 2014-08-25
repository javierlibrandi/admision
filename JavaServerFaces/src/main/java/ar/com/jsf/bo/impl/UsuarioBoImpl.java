package ar.com.jsf.bo.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import org.springframework.transaction.annotation.Transactional;

import ar.com.jsf.bo.UsuarioBo;
import ar.com.jsf.domain.Usuario;
import ar.com.jsf.domain.dao.UsuarioDao;

@Service
@Transactional
public class UsuarioBoImpl implements UsuarioBo,Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private UsuarioDao usuarioDao;

	private Usuario usuario;
	
	

	public Usuario getUsuario(){
		return this.usuario;
	}
	
	public void setUsuarioDao(UsuarioDao usuarioDao) {
		this.usuarioDao = usuarioDao;
	}
	
	@Override
	public boolean ValidarUsuario(String usuario, String clave) {
		this.usuario = usuarioDao.findByUsuario(usuario);
		
		if (this.usuario != null && this.usuario.getClave().equals(clave)){
			return true;
		}
		
		return false;
	}



	@Override
	public List<Usuario> getListUsuarios() {
		return usuarioDao.findAll();
		
	}




}
