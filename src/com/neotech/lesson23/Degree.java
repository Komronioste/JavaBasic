package com.neotech.lesson23;

public class Degree {

	 void getPrereq()
	{
		System.out.println("To get a degree you need HS diploma ");
	}
	
	
	public static void main(String[] args) {
		
		
		Degree d = new Degree();
		Bachelors b = new Bachelors();
		Masters m = new Masters();
		
		
		d.getPrereq();
		b.getPrereq();
		m.getPrereq();
		
		
	}
	
	
	
}
class Bachelors extends Degree{
	
	
}

class Masters extends Degree {
	
	 void getPrereq()
	{
		System.out.println("To get a Masters degree you need HS diploma and Bachelor's degree");
	}
}
