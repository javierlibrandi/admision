package ar.com.jsf.bo.impl;

import java.io.Serializable;

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
	
	@Override
	public boolean ValidarUsuario(String username, String password) {
		this.usuario = usuarioDao.bucarUsuarioPorNamePassword(username,password);
		
		if (this.usuario!=null){
			return true;
		}
		return false;
	}

	public void setUsuarioDao(UsuarioDao usuarioDao) {
		this.usuarioDao = usuarioDao;
	}



}
