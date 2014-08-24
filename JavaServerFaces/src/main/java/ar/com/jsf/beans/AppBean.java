package ar.com.jsf.beans;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import ar.com.jsj.util.MyUtil;

@ManagedBean
@ApplicationScoped
public class AppBean {

	public AppBean(){
	}
	
	public String getBaseUrl(){
		 return MyUtil.baseUrl();
	}
	
}
