package com.neotech.lesson15;

public class Student {

	void getGrade (int a)
	{
		if (a>90)
		{
			System.out.println("A");
		}
		else if (a>80 && a<= 90)
		{
			System.out.println("B");
		}
		else if (a>70 && a<=80)
		{
			System.out.println("C");
		}
		else if (a>60 && a <=70)
		{
			System.out.println("D");
		}
		else {System.out.println("F");}
	}

	
	public static void main(String[] args) {
		

		Student Komron = new Student();
Komron.getGrade(82);
		Student Shodmon = new Student();
Shodmon.getGrade(98);

	}
	

}
