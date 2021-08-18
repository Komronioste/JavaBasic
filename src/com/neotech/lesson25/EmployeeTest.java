package com.neotech.lesson25;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee emp = new Employee();

		emp.setName("K");

		System.out.println(emp.getName());

		emp.setAge(30);

		System.out.println(emp.getAge());
		
		emp.setSalary(95000);
		
	//	System.out.println(emp.getSalary());
	}

}
