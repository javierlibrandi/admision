package ar.com.admision.service;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ar.com.admision.dominio.User;
import ar.com.admision.mo.UserMO;

@Service
@Transactional(propagation=Propagation.REQUIRED)
public class DBLoaderImpl implements DBLoader {
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private UserMO userMO; 
	
		
	public void loadObjects() {
		System.out.println("==================== Entrando a loadObjects ==========================");
		User user = this.userMO.getUserPerez();
		
		this.sessionFactory.getCurrentSession().save(user);
		
		System.out.println("====================  Saliendo a loadObjects ==========================");
	}

	

	public void run() {
		cargaItemConDosBids();
	}
	
	
	private void cargaItemConDosBids() {
//		Item blackBerry =  new Item("iPad", 3500);
//		
//		blackBerry.addBid(new Bid(3400));
//		blackBerry.addBid(new Bid(3450));		
//		
//
//		this.sessionFactory.getCurrentSession().save(blackBerry);
	}
	
	
	

}
