package com.crisil;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee> {
	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {	
		return new Employee(rs.getInt("id"), rs.getString("name"), 
				rs.getDouble("salary"));
	}	
}
