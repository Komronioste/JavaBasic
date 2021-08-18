package com.neotech.lesson24;

public class DrivableTest {
	
	
	public static void main(String[] args) {
		
		
		
		Vehicles v = new Cars();
		
		v.start();
		v.stop();
		
		Drivable dr = new Cars();
		
		dr.drive();
		System.out.println(Drivable.MOVE_FAST);
		
		
		Cars cr = new Cars();
		
		System.out.println(cr.MOVE_FAST);
		
		
		
		
		
	}

}
