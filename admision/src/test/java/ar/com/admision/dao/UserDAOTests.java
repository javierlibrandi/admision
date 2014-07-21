package ar.com.admision.dao;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import ar.com.admision.dominio.User;
import ar.com.admision.mo.UserMO;

@ContextConfiguration("/applicationContext.xml")
public class UserDAOTests extends AbstractTransactionalJUnit4SpringContextTests{
	
	@Autowired
	private UserDAO userDao;
	
	@Autowired
	private UserMO userMO;
		
	@Test
	@Rollback(false)
	public void findByUserNamePassword(){
		String userName = "juan.perez";
		String password = "zaraza";

		
		User perez = this.userMO.getUserPerez();
		
		this.userDao.save(perez);
		
		perez = this.userDao.findByUserNamePassword(userName, password);
	
		assertEquals(userName, perez.getUserName());
		assertEquals(password, perez.getPassword());
		
		this.userDao.delete(perez);
		
	}
	
	

}
