package com.neotech.lesson21;

public class School {

	public static void main(String[] args) {
		
		
		PianoTeacher pt = new PianoTeacher();
		pt.name = "Chris";
		pt.lastName = "Brown";
		pt.instrument = "Yamaha";
		pt.numberOfStudents =32;
		pt.schoolName = "Neotech";
		pt.fullTime();
		
		System.out.println("--------------------------------");
		
		MathTeacher mt = new MathTeacher();
		mt.name = "Melinda";
		mt.lastName = "Jones";
		mt.schoolName = "Neo";
		mt.subject = "Algebra";
		mt.adds();
		mt.fullTime();
		
		System.out.println("--------------------------------");
		
		ChemistryTeacher ct = new ChemistryTeacher();
		ct.name = "Alex";
		ct.lastName = "Smith";
		ct.schoolName = "S";
		ct.salary = 24500;
		ct.fullTime();
		ct.explodes();
		
		System.out.println(ct.name + " " + ct.lastName + " has a salary of " + ct.salary);
	}

}
