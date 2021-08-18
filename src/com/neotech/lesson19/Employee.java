package com.neotech.lesson19;

public class Employee {

	
	static String company;
	
	public String empName;
	protected String empLastName;
	
	double salary;
	
	private int ssn;
	
	
	public void method1()
	{
		System.out.println("I am a public method!!");
	}
	
	protected void method2()
	{
		System.out.println("I am protected method!!");
	}
	
	void method3()
	{
		System.out.println("I am default method");
	}
	
	private void method4()
	{
		System.out.println("I am private method");
	}
	
	
	
	public static void main(String[] args) {
	
		Employee emp = new Employee();
		
		company = "Neotech";
		
		emp.empName = "Sabah";
		emp.empLastName = "Bushaj";
		emp.salary = 60;
		emp.ssn = 123456;
		
		// so far we were able to access all modifiers
		
		emp.method1();
		emp.method2();
		emp.method3();
		emp.method4();
		
		
		

	}

}
