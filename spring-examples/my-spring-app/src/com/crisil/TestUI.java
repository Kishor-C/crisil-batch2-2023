package com.crisil;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUI {

	public static void main(String[] args) {
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("spring-beans.xml");
		EmployeeService service = 
				(EmployeeService)ctx.getBean("employeeService");
		Scanner scan = new Scanner(System.in);
		int selection = 0;
		do { 
			// switch case with keyboard input goes here
			System.out.println("----------Enter options---------");
			System.out.println("1:Store, 2:FindAll, "
					+ "3:FindById, 4: DeleteById -1:Exit");
			selection = scan.nextInt(); // waits for user to give input
			switch(selection) {
			case 1: // call store - dynamically enter id, name & salary
				break;
			case 2: 
				// call findEmployees
				List<Employee> list = service.fetchEmployees();
				for(Employee e : list) {
					System.out.println("Id = "+e.getId());
					System.out.println("Name = "+e.getName());
					System.out.println("Salary = "+e.getSalary());
					System.out.println("__________________________");
				}
				break;
			case 3: 
				// call findEmployee
				System.out.println("Enter id");
				Employee e = service.fetch(scan.nextInt());
				System.out.println("Id = "+e.getId());
				System.out.println("Name = "+e.getName());
				System.out.println("Salary = "+e.getSalary());
				System.out.println("__________________________");
				break;
			}
		} while(selection != -1);
	}

}
