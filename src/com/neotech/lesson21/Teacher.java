package com.neotech.lesson21;

public class Teacher {

	String schoolName;
	String name;
	String lastName;

	public void fullTime() {
		System.out.println(name + " " + lastName + " teaches at " + schoolName + " full time");
	}

}

class MathTeacher extends Teacher {

	String subject;
	double chapters;

	public void adds() {
		System.out.println("Adds");
	}

}

class ChemistryTeacher extends Teacher {

	String car;
	double salary;

	public void explodes() {
		System.out.println("Chemic blasts stuff");
	}
}

class PianoTeacher extends Teacher {

	int numberOfStudents;
	String instrument;

	public void plays() {
		System.out.println("Plays piano");
	}

}