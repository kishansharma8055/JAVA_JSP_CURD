package com.kishan.mvc.dao;

import java.sql.SQLException;
import java.util.List;

import com.kishan.mvc.model.Employee;

public interface EmployeeDao {
	public String addData(Employee employee) throws SQLException,ClassNotFoundException;
	public Boolean updateData(Employee employee) throws SQLException,ClassNotFoundException;
	public Boolean deleteData(Integer empNo) throws SQLException,ClassNotFoundException;
	public Employee findData(Integer empNo) throws SQLException,ClassNotFoundException;
	public List<Employee> findAll() throws SQLException,ClassNotFoundException;
		
	

}
