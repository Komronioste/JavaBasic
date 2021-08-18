package com.neotech.lesson14;

public class School {

	public static void main(String[] args) {
		
		
		Student s1 = new Student();
		
		s1.name = "Komron";
		s1.surname = "Babakhanzoda";
		s1.age = 30;
		s1.school = "GMU";
		s1.studentID = 12345;
		
		s1.doHomework();
		s1.study();
		s1.profile();

		
		Student s2 = new Student();
		
		s2.name = "Hakan";
		s2.surname = "K";
		s2.studentID = 2;
		s2.school = "Neotech Academy";
		
		s2.age = 30;
		s2.doHomework();
		s2.study();
		s2.profile();
	}

}
