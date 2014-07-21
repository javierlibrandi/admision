package ar.com.admision.mo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ar.com.admision.service.DBLoader;



public class DBLoaderRun {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");		

		
		DBLoader dbLoader = context.getBean(DBLoader.class);
		
		dbLoader.run();
	}	
}
