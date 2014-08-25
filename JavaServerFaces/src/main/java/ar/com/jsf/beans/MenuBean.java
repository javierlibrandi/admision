package ar.com.jsf.beans;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import org.omg.CORBA.Request;
import org.primefaces.context.RequestContext;

@ManagedBean
@RequestScoped
public class MenuBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void save() {
        addMessage("Success", "Data saved");
    }
     
    public void update() {
        addMessage("Success", "Data updated");
    }
     
    public void delete() {
        addMessage("Success", "Data deleted");
    }
     
    public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    public String salir(){
//    	RequestContext context = RequestContext.getCurrentInstance();
    	FacesContext facesContext =  FacesContext.getCurrentInstance();
    	HttpSession session =  (HttpSession) facesContext.getExternalContext().getSession(false);
    	session.invalidate();
    	return "login";
    }
}
