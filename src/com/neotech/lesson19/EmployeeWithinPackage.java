package com.neotech.lesson19;

public class EmployeeWithinPackage {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		Employee.company = "neotech"; // even though company is static, its in different class, so we cant access it without specifying the class it belongs to.
	
		emp.empName = "Sahin";
		emp.empLastName = "Erol";
		emp.salary = 70;
	//	emp.ssn = 1231;    cannot be accessed because it is private. and private is visible only within the same class.
		
		emp.method1();
		emp.method2();
		emp.method3();
//		emp.method4(); error says that this method is not visible. it is not visible because it is private and in different class.
	

	}

}
