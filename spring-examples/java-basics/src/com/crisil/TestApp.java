package com.crisil;

import java.util.ArrayList;
import java.util.List;

public class TestApp {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		// datatypes - int, float, double, boolean, char
		// user-defined types - all classes, interfaces, arrays
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("c = "+c);
		int[] arr = {5, 1, 3, 2, 4};
		for(int d : arr) {
			System.out.println(d);
		}
		System.out.println("----- Object Creation-----");
		Employee emp1 = new Employee(1234, "Raj", 35200);
		Employee emp2 = new Employee(4567, "Vijay", 42000);
		System.out.println("Emp1 id = "+emp1.getId()+", Name = "+emp1.getName());
		System.out.println("Emp2 id = "+emp2.getId()+", Name = "+emp2.getName());
		System.out.println("----- Using interfaces ------");
		A ref = new X(); // we can still abstract which object A takes with Factory
		ref.save();		  // pattern
		ref = new Y();
		ref.save();
		System.out.println("---Adding employee inside List----");
		List<Employee> list = new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		list.add(new Employee(890, "Sachin", 20000));
		for(Employee e : list) {
			System.out.println(e.getId()+", "+e.getName()+", "+e.getSalary());
			System.out.println("-------------------------------------");
		}
		System.out.println("--- Type conversions ----");
		Object o1; // Higher type
		o1 = new X(); // Object = X, Auto-conversion
		X x1 = (X) o1; // X = Object, Explicit-conversion
		x1.save();
	}
}
