package com.neotech.lesson20;

public class Student {

	
	int gradeOne;
	int gradeTwo;
	int gradeThree;
	String studentName;
	
	Student(String name, int grade1, int grade2, int grade3) 
	{
	
	 gradeOne = grade1;
	 gradeTwo = grade2;
	 gradeThree = grade3;
	 studentName = name;
	
	}
	
	public void average ()
	{
	double average = ((gradeOne + gradeTwo + gradeThree)/3);
	System.out.println(studentName + " has an average grade of: " + average);
	}
	
	
	
	
	public static void main(String[] args) {
		
		Student one = new Student ("Komron", 40, 50, 60);
		one.average();
		Student two = new Student ("Murat", 95, 96, 95);
		two.average();
		Student three = new Student ("Elion", 100, 100, 100);
		three.average();
		Student four = new Student ("Shodmon", 94, 92, 100);
		four.average();
		Student five = new Student ("Sabah", 105, 100, 95);
		five.average();

	}

}
