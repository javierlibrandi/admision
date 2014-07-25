package ar.com.admision.dao;

import java.io.Serializable;

import ar.com.admision.dominio.User;


public interface UserDAO extends DAO<User>{
	
	public User findByUserNamePassword(String userName, String password);

}