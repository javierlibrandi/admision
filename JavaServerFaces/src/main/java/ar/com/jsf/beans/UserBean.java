package ar.com.jsf.beans;

import java.io.Serializable;





import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import ar.com.jsf.bo.UserBo;


@Component
@Scope("session")
public class UserBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private UserBo userBo;
	 
	public void setUserBo(UserBo userBo) {
		this.userBo = userBo;
	}
 
	public String printMsgFromSpring() {
 
		return userBo.getMessage();
 
	}
}
