package com.neotech.lesson14;

public class Student {

	
	String name, surname, school;
	int studentID, age;
	
	void study()
	{
		System.out.println(name + " " + surname + " is studying");
	}
	
	void doHomework()
	{
		System.out.println(name + " is doing the homework");
	}
	
	void profile()
	{
		System.out.println(name + " " + surname + " " + studentID + " " + school + " " + age);
	}
}
