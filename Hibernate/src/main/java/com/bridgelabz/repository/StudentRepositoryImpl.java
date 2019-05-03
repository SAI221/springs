package com.bridgelabz.repository;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.bridgelabz.model.Student;

public class StudentRepositoryImpl implements StudentRepository{
	 static Session sessionObj;
	    static SessionFactory sessionFactoryObj;
	 
	    public final static Logger logger = Logger.getLogger(StudentRepositoryImpl.class);
	 
	    // This Method Is Used To Create The Hibernate's SessionFactory Object
	    private static SessionFactory buildSessionFactory() {
	        // Creating Configuration Instance & Passing Hibernate Configuration File
	        Configuration configObj = new Configuration();
	        configObj.configure("hibernate.cfg.xml");
	 
	        // Since Hibernate Version 4.x, ServiceRegistry Is Being Used
	        ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(configObj.getProperties()).build(); 
	 
	        // Creating Hibernate SessionFactory Instance
	        sessionFactoryObj = configObj.buildSessionFactory(serviceRegistryObj);
	        return sessionFactoryObj;
	    }
	public void createRecord() {
		 int count = 0;
	        Student studentObj = null;
	        try {
	            // Getting Session Object From SessionFactory
	            sessionObj = buildSessionFactory().openSession();
	            // Getting Transaction Object From Session Object
	            sessionObj.beginTransaction();
	 
	            // Creating Transaction Entities
	            for(int j = 1; j <= 2; j++) {
	                count = count + 1;
	                studentObj = new Student();             
	                studentObj.setEmail("sai@g.com");
	                studentObj.setMobileNo(913396);
	                studentObj.setName("sai");
	                studentObj.setPassword("0000");
	                sessionObj.save(studentObj);
	            }
	 
	            // Committing The Transactions To The Database
	            sessionObj.getTransaction().commit();
	            logger.info("\nSuccessfully Created '" + count + "' Records In The Database!\n");
	        } catch(Exception sqlException) {
	            if(null != sessionObj.getTransaction()) {
	                logger.info("\n.......Transaction Is Being Rolled Back.......\n");
	                sessionObj.getTransaction().rollback();
	            }
	            sqlException.printStackTrace();
	        } finally {
	            if(sessionObj != null) {
	                sessionObj.close();
	            }
	        }
	    }
		
	

}
