package com.neotech.lesson25;

public class Employee {
	
//define private variables
	private String name;
	private int age;
	private double salary;
	
	
	//define getter and setter methods
	
	
	//getter
	public String getName()
	{
		return name;
	}
	
	//setter
	public void setName(String name)
	{
		if (!name.isEmpty() && name.length()>3)
		this.name = name;
		else
		System.out.println("This is too short");
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}

	
	// I dont want them to get salary from another class
//	public double getSalary() {
//		return salary;
//	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
