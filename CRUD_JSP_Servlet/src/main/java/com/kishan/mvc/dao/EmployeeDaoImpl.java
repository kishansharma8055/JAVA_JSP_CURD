package com.kishan.mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.kishan.mvc.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
    private Connection connection;
	private ResultSet resultSet;
	private String sql="";
	PreparedStatement preparedStatement;

	public EmployeeDaoImpl() {
		try {
			connection=MyConnection.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String addData(Employee employee) throws SQLException, ClassNotFoundException {
		sql="Insert into employees values(?,?,?)";
		preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setInt(1,employee.getEmpNo());
		preparedStatement.setString(2,employee.getEmpName());
		preparedStatement.setDouble(3,employee.getSalary());
		
		Integer count=preparedStatement.executeUpdate();
		
		return count+" row added successfully";
			
	}

	@Override
	public Boolean updateData(Employee employee) throws SQLException, ClassNotFoundException {
		
			sql="Update employees set salary=?,name=? where emp=?";
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setDouble(1,employee.getSalary());		
		
		       preparedStatement.setInt(3,employee.getEmpNo());
		      preparedStatement.setString(2, employee.getEmpName());
            Integer count=preparedStatement.executeUpdate();
		
		if (count>0) {
			 return true;
		}
		else {
			return false;
		}
		
		
	}

	@Override
	public Boolean deleteData(Integer empNo) throws SQLException, ClassNotFoundException {
		sql="delete from employees where emp=?";
		preparedStatement=connection.prepareStatement(sql);
		
		preparedStatement.setInt(1, empNo);
		Integer count=preparedStatement.executeUpdate();
			
	    if (count>0) return true;
	    else return false;
		
	}

	@Override
	public Employee findData(Integer empNo) throws SQLException, ClassNotFoundException {
		Employee employee=new Employee();
		sql="select * from employees where emp=?";
		preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setInt(1, empNo);
		resultSet=preparedStatement.executeQuery();
		if(resultSet.next()) {
			employee.setEmpNo(resultSet.getInt(1));
			employee.setEmpName(resultSet.getString(2));
			employee.setSalary(resultSet.getDouble(3));
		}
		return employee;
	}

	@Override
	public List<Employee> findAll() throws SQLException, ClassNotFoundException {
		List<Employee> list=new ArrayList<Employee>();
		sql="select * from employees order by 1";
		preparedStatement=connection.prepareStatement(sql);
		
		resultSet=preparedStatement.executeQuery();
		
		while(resultSet.next()==true) {
			Employee employees=new Employee();
			employees.setEmpNo(resultSet.getInt(1));
			employees.setEmpName(resultSet.getString(2));
			employees.setSalary(resultSet.getDouble(3));
			list.add(employees);
		}
		
		return list;
	}

}
