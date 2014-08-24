package ar.com.jsf.beans;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.primefaces.context.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import ar.com.jsf.bo.UsuarioBo;

@Component
@Scope("session")
public class UserLoginView implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;

	@Autowired
	private UsuarioBo usuarioBo;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setValidarUsuarioBo(UsuarioBo usuarioBo) {
		this.usuarioBo = usuarioBo;
	}

	public void login(ActionEvent event) {
		RequestContext context = RequestContext.getCurrentInstance();
		FacesMessage message = null;
		boolean loggedIn = false;
		String ruta = "";
		loggedIn = usuarioBo.ValidarUsuario(this.username, this.password);

		if (loggedIn) {
			FacesContext.getCurrentInstance().getExternalContext()
					.getSessionMap()
					.put("usuario", usuarioBo.getUsuario().getUsuario());
			message = new FacesMessage(FacesMessage.SEVERITY_INFO,
					"Bienvenido", username);
			ruta = "views/menu.xhtml";
		} else {

			message = new FacesMessage(FacesMessage.SEVERITY_WARN,
					"Loggin Error", "Usuario y/o Cleve es incorrecto");
		}

		FacesContext.getCurrentInstance().addMessage(null, message);
		context.addCallbackParam("loggedIn", loggedIn);
		context.addCallbackParam("ruta", ruta);
	}

}
