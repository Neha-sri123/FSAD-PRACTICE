package com.klu.util;
import org.hibernate.cfg.Configuration;

import org.hibernate.SessionFactory
public class HibernateUtil {
          private static final SessionFactory sessionFactory=buildSessionFactory
 privatr static SessionFactory buildSession
 try {
	 return new Configuration().equals(configure().buildSessionFactory)
 }
          catch(Exception e) {
        	  throw new ExceptionInitializer(e);
          }
}
public static SessionFactory getSessionFactory() {
	retur SessionFactory buildSession
}
          
