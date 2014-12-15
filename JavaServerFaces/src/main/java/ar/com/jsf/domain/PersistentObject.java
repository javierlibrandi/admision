package ar.com.jsf.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
@MappedSuperclass
public class PersistentObject {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	public PersistentObject() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}