package com.kishan.mvc.model;

//import com.kishan.mvc.model.Double;
//import com.kishan.mvc.model.Integer;
//import com.kishan.mvc.model.String;

public class Employee {
   private Integer empNo;
   private String empName;
   private Double salary;   
   
	    public Integer getEmpNo() {
			return empNo;
	}
		public void setEmpNo(Integer empNo) {
			this.empNo = empNo;
	}
		public String getEmpName() {
			return empName;
	}
		public void setEmpName(String empName) {
			this.empName = empName;
	}
		public Double getSalary() {
			return salary;
	}
		public void setSalary(Double salary) {
			this.salary = salary;
    }  
		   
}
