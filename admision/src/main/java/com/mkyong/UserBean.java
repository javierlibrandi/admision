package com.mkyong;

import com.mkyong.user.bo.UserBo;

import java.io.Serializable;



import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;



@ManagedBean
@SessionScoped
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