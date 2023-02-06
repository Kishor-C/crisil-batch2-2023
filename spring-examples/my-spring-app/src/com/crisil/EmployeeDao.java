package com.crisil;

import java.util.List;

public interface EmployeeDao {
	// we will have 5 methods like save, fetchAll, fetch, delete, update
	public int store(Employee employee); // returns 1 for success 0 for failure
	public List<Employee> fetchAll();
	public Employee fetch(int id);

}
