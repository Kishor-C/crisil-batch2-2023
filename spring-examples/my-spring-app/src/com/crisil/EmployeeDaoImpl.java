package com.crisil;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository // id = employeeDaoImpl
public class EmployeeDaoImpl implements EmployeeDao {
	// this provides methods like update, queryForObject, query methods
	@Autowired
	private JdbcTemplate template; // create setter method
	

	// spring will supply the object to the DAO 
	// <property name = "template" ref = "jdbcTemplate">
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	@Override
	public int store(Employee employee) {
		
		String query = "insert into employee_kishor values(?,?,?)";
		int status = template.update(query, 
				employee.getId(), employee.getName(), employee.getSalary());
		return status;
	}

	@Override
	public List<Employee> fetchAll() {
		String querySQL = "select * from employee_kishor";
		List<Employee> list = template.query(querySQL, new EmployeeMapper());
		return list;
	}

	@Override
	public Employee fetch(int id) {
		String selectQuery = "select * from employee_kishor where id = ?";
		Employee e = 
		template.queryForObject(selectQuery, new EmployeeMapper(), id);
		return e;
	}
	
}
