package ar.com.jsf.beans;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;

import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ar.com.jsf.bo.UsuarioBo;
import ar.com.jsf.domain.Usuario;


@Component
@RequestScoped
public class UsuarioBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private UsuarioBo usuarioBo;

	private List<Usuario> usuarios;
	private Usuario usuarioSeleccionado;
	
	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public void setUsuarioBo(UsuarioBo usuarioBo) {
		this.usuarioBo = usuarioBo;
	}

	public List <Usuario> getListaUsuarios(){
		return this.usuarioBo.getListUsuarios();
	}
	
	
	//
//	public void onRowEdit(RowEditEvent event) {
//		FacesMessage msg = new FacesMessage("Car Edited",
//				((Car) event.getObject()).getId());
//		FacesContext.getCurrentInstance().addMessage(null, msg);
//	}
//
//	public void onRowCancel(RowEditEvent event) {
//		FacesMessage msg = new FacesMessage("Edit Cancelled",
//				((Car) event.getObject()).getId());
//		FacesContext.getCurrentInstance().addMessage(null, msg);
//	}

	public Usuario getUsuarioSeleccionado() {
		return usuarioSeleccionado;
	}

	public void setUsuarioSeleccionado(Usuario usuarioSeleccionado) {
		this.usuarioSeleccionado = usuarioSeleccionado;
	}


	
	public void btnBorrarUsuario(){
	}
}
