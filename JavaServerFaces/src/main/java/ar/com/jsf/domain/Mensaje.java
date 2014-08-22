package ar.com.jsf.domain;

import javax.persistence.Entity;

@Entity
public class Mensaje extends PersistentObject {

	private String mensaje;

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}
