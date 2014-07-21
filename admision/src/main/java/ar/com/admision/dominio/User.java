package ar.com.admision.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public class User extends PersistentObject {

	private String userName;

	private String password;

	public User() {
	}

	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	@Column(name = "userName",unique=true)
	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

}
