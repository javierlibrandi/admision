package ar.com.jsf.beans;

import java.io.Serializable;







import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import ar.com.jsf.bo.UserBo;


@ManagedBean
@SessionScoped
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
