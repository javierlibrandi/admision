package ar.com.admision.dao;

import java.io.Serializable;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import ar.com.admision.dominio.User;

@Repository
public class UserDAOImpl extends AbstractDAO<User,Serializable> implements UserDAO{

	public User findByUserNamePassword(String userName, String password) {
		String strQuery = "from User u where u.userName = :userName and " + 
						  "password = :password";
		Query query = em.createQuery(strQuery);
		
		//Query query = currentSession().createQuery(strQuery);
		
		query.setParameter("userName", userName)
		  	 .setParameter("password", password);
		
		return (User) query.getSingleResult();
	}

	public Class<User> getEntityClass() {
		return User.class;
	}

}
