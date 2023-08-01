package com.employee;
import java.util.ArrayList;
public class EmployeeRecords {

	public static void createRecords(){
		// TODO Auto-generated method stub

		ArrayList<Employee> employeeArray=new ArrayList();
		employeeArray.add(new Employee("Peter","Sales"));
		employeeArray.add(new Employee("Edgar","Accounts"));
		employeeArray.add(new Employee("William","Training"));
		employeeArray.add(new Employee("Simond","Training"));
		
		for(Employee e:employeeArray)
		{
			System.out.print(e.getEmployeeName()+ " ,");
			System.out.print(e.getDepartment());
			System.out.println(",");
			
		}
		
	}

}
