package com.greatlearning.teachers.util;

import java.util.Properties;

import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.mysql.cj.xdevapi.SessionFactory;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
	private static SessionFactory getSessionFactory() {
		
		Configuration configuration = new Configuration();
		
		Properties hibernateProperties = new Properties();
		hibernateProperties.put(Environment.DRIVER,"");
		hibernateProperties.put(Environment.URL,"");
		hibernateProperties.put(Environment.USER,"");
		hibernateProperties.put(Environment.PASS,"");
		hibernateProperties.put(Environment.DIALECT,"");
		
		configuration.setProperties(hibernateProperties);
		return null;
	}

}
