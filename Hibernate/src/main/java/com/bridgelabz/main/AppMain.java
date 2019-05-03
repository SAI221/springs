package com.bridgelabz.main;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.bridgelabz.repository.StudentRepository;
import com.bridgelabz.repository.StudentRepositoryImpl;

public class AppMain {
	 

    public final static Logger logger = Logger.getLogger(AppMain.class);
   
    public static void main(String[] args) {
    	 BasicConfigurator.configure();
        logger.info(".......Hibernate Crud Operations Example.......\n");
     
        logger.info("\n=======CREATE RECORDS=======\n");
        StudentRepository obj=new StudentRepositoryImpl();
        obj.createRecord();
 
		
        
    } 
}