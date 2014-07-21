package ar.com.admision.mo;

import org.springframework.stereotype.Component;

import ar.com.admision.dominio.User;

import com.cubika.devsupport.motherobject.DatabaseProviderMotherObjectImpl;
import com.cubika.devsupport.motherobject.TestObject;


@Component
public class UserMO extends DatabaseProviderMotherObjectImpl<User>{

	public UserMO() {
		super(User.class);
	}

	@Override
	public User getDefault() {
		return getUserPerez();
	}
	
	@TestObject
	public User getUserPerez(){
		User user = null;
		if(!instanceExists("perez")){
			user = new User("juan.perez","zaraza");
			addInstance("perez", user);
		}
		return user;
	}
	
}
