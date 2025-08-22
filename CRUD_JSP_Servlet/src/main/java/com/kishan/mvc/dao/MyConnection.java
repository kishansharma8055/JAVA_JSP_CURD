package com.kishan.mvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
   private static Connection connection;
   
   
   public static Connection getConnection() throws SQLException, ClassNotFoundException {
  	 String driverName="com.mysql.cj.jdbc.Driver";
  	 String username="root";
  	 String url="jdbc:mysql://localhost:3306/jsp_db";
  	 String password="Kishan@123";
  	if(connection==null) {
  		 Class.forName(driverName);
      	 connection=DriverManager.getConnection(url,username,password);	
  	}
  	return connection;
  } 
   
}
