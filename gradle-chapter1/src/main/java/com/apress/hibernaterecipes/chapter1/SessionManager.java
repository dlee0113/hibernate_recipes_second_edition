/**
 * 
 */
package com.apress.hibernaterecipes.chapter1;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * @author sree
 *
 */
public class SessionManager {
	
	private static final SessionFactory sessionFactory = buildSessionFactory(); 
	 
	private static SessionFactory buildSessionFactory() { 
		try { 
		 // Create the SessionFactory from hibernate.cfg.xml 
			 Configuration configuration = new Configuration().configure();
			 ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                     .applySettings(configuration.getProperties())
                     .build();
			 return configuration.buildSessionFactory(serviceRegistry);
			 
		} 
		catch (Throwable ex) { 
		 // Make sure you log the exception, as it might be swallowed 
			 ex.printStackTrace(); 
		 
			 throw new ExceptionInInitializerError(ex); 
		} 
	} 
	 
	public static SessionFactory getSessionFactory() { 
		return sessionFactory; 
	} 


}
