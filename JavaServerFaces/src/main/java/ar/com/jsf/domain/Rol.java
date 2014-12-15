package ar.com.jsf.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Rol extends PersistentObject {

	private String nombre;
	private String descripcion;
	private String estado;

	

	public String getNombre() {
		return nombre;
	}

	public Rol() {
	}

	public Rol(String nombre, String descripcion, String estado) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estado = estado;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
