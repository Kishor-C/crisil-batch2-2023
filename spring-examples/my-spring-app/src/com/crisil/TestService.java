package com.crisil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestService {
	public static void main(String[] args) {
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("spring-beans.xml");
		EmployeeService service = 
				(EmployeeService)ctx.getBean("employeeService");
		Employee emp = new Employee(8, "Edward", 70000);
		int status = service.save(emp);
		System.out.println("Status = "+status);
	}
}	
