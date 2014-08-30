package ar.com.jsf.beans;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.http.HttpSession;

import org.primefaces.context.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import ar.com.jsf.bo.UsuarioBo;

@Component
@Scope("session")
public class LoginBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private boolean loggedIn = false;

	public boolean estaLogeado() {
		return this.loggedIn;
	}

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

		String ruta = "";
		this.loggedIn = usuarioBo.ValidarUsuario(this.username, this.password);

		if (this.loggedIn) {
			FacesContext.getCurrentInstance().getExternalContext()
					.getSessionMap()
					.put("usuario", usuarioBo.getUsuario().getUsuario());
			message = new FacesMessage(FacesMessage.SEVERITY_INFO,
					"Bienvenido", username);

			ruta = "views/menu.xhtml";
		} else {

			message = new FacesMessage(FacesMessage.SEVERITY_WARN,
					"Error en la Autentifiacion ",
					"Usuario y/o Cleve es incorrecto");
		}

		FacesContext.getCurrentInstance().addMessage(null, message);
		context.addCallbackParam("loggedIn", this.loggedIn);
		context.addCallbackParam("ruta", ruta);
	}

	public String logout() {
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance()
				.getExternalContext().getSession(false);
		session.invalidate();
		this.loggedIn = false;
		return "login";
    }
	

}
