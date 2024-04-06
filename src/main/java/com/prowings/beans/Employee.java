package com.prowings.beans;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	
//	MyLogger logger = new MyLogger();
	
	public void work()
	{
//		logger.log("logging something before...");
		
		System.out.println("inside Employee work method!!");

//		logger.log("logging something after...");
	}

	public void getEmployeeByName(String name)
	{
		System.out.println("inside getEmployeeByName()method!!");
	}


}
