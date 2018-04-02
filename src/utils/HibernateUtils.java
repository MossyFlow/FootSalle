package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	
	public static final SessionFactory sessionFactory;
	
	
	static {
			try {
				
				sessionFactory = new Configuration().configure().buildSessionFactory();
				
			}catch (Throwable ex) {
				System.err.println("Création du session Factory à échoué." + ex);
				throw new ExceptionInInitializerError(ex);
			}
	}
	
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
