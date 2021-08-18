package com.neotech.lesson19_1;

import com.neotech.lesson19.Employee;

//importing class Employee

public class EmployeeOutsidePackage {
	
	

	public static void main(String[] args) {
		
		
		
		Employee emp = new Employee(); // wont see Employee class from different package, but java helps us to import it.
		
	//	company = "Neotech";   --> need to specify the class it belongs to like Employee.company = "Neotech";
		
		emp.empName = "Komron";
	//	emp.empLastName = "Babakhanzoda"; no direct access
	//	emp.salary = 80;				  no direct access	 
	//	emp.ssn;						  no direct access	
		
		emp.method1();
	//	emp.method2();
		
	
		
		
	}

}
