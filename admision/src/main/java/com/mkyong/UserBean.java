package com.mkyong;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mkyong.user.bo.UserBo;


@Component
@Scope("session")
public class UserBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5260116730324981516L;
	@Autowired
	UserBo userBo;

	public void setUserBo(UserBo userBo) {
		this.userBo = userBo;
	}

	public String printMsgFromSpring() {

		return userBo.getMessage();

	}

}