package com.crisil;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // id = employeeService
public class EmployeeService {
	@Autowired
	private EmployeeDao dao; // EmployeeDaoImpl implements EmployeeDao

	public void setDao(EmployeeDao dao) {
		this.dao = dao;
	}
	public int save(Employee employee) {
		return dao.store(employee);
	}
	public List<Employee> fetchEmployees() {
		return dao.fetchAll();
	}
	public Employee fetch(int id) {
		return dao.fetch(id);
	}
}
