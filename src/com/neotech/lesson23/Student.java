package com.neotech.lesson23;

public class Student {

	public void studyJava() {
		System.out.println("Not everyone studies Java");
	}

	public void lecture() {
		System.out.println("Only some students have lectures");
	}

	public static void main(String[] args) {

		Student st = new NeotechStudent();
		Student st1 = new CollegeStudent();
		Student st2 = new SchoolStudent();

		st.studyJava();
		st.lecture();

		st1.studyJava();
		st1.lecture();

		st2.studyJava();
		st2.lecture();
} }

class NeotechStudent extends Student {
	@Override
	public void studyJava() {
		System.out.println("Study Java in fast pace @ Neotech");
	}
	@Override
	public void lecture() {
		System.out.println("Lectures have only 15 people @ Neotech");
	}

}

class CollegeStudent extends Student {

	@Override
	public void lecture() {
		System.out.println("Lectures have 120 people @ College");
	}

	@Override
	public void studyJava() {
		System.out.println("Study Java very slowly @ College");
	}

}

class SchoolStudent extends Student {
	@Override
	public void lecture() {
		System.out.println("Classrooms have only 10 people @ HS");
	}

}
