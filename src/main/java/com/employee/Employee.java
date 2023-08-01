package com.employee;

public class Employee {
	
	private String employeeName;
	private String department;
	
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", department=" + department + "]";
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String employeeName, String department) {
		super();
		this.employeeName = employeeName;
		this.department = department;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	

}
