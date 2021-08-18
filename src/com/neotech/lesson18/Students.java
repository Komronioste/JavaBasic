package com.neotech.lesson18;

public class Students {

	String studentName;
	int studentID;
	static int numberOfStudents = 0;

	static int number() {
		return numberOfStudents++;
	}

	public static void main(String[] args) {

		Students s1 = new Students();
		s1.studentName = "Komron";
		s1.studentID = 123;

		number();

		Students s2 = new Students();
		s2.studentName = "Shodmon";
		s2.studentID = 423;

		number();

		Students s3 = new Students();
		s3.studentName = "Murat";
		s3.studentID = 712;

		number();
		
	

		System.out.println("There are " + numberOfStudents + " students in the class");
		
	

	}

}
