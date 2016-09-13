package com.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String [] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		AuthorGreeter obj = (AuthorGreeter) context.getBean("AuthorGreeter");
	      
	    System .out.println(obj.getGreeting());
	    
	}
}

