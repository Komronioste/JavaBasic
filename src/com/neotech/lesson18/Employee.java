package com.neotech.lesson18;

public class Employee {

	
	int eID;
	double salary;
	
	static String CEO = "Elion";
	
	void info()
	{
		System.out.println("Employee with eID: " + eID + " makes " + salary + " and his CEO is " + CEO);
	}
	
	
	public static void main(String[] args) {
		
		Employee Ahmet = new Employee();
		Employee Ihsan = new Employee();
		
		Ahmet.salary = 50500;
		Ihsan.salary = 50350;
		
		Ahmet.eID =3;
		Ihsan.eID =4;
		
		Ahmet.info();
		Ihsan.info();
		
		
	}

}
