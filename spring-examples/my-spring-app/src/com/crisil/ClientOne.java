package com.crisil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientOne {
	public static void main(String[] args) {
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("spring-beans.xml");
		Dbi db = (Dbi) ctx.getBean("b1"); // supplies the object
		db.save();
		// Dbi db = new MySql();
	}
}
