package com.neotech.lesson24;

public interface Drivable {
	
    boolean MOVE_FAST = true; //automatically become public static final !!
	
	public void drive(); //even though we are not saying *abstract* in front of it, Java adds itself
	

	}

abstract class Vehicles {
	
	// here we can define implemented methods and abstract/undefined methods
	
	void start ()
	{
		System.out.println("Vehicle can start");  //implemented
	}
	
    abstract void stop();  //abstract
    
   
	
	
}

//achieving multiple inheritance 

class Cars extends Vehicles implements Drivable {

																				// a class extends another class
																					//a class implements an interface
		
	@Override
	public void drive() {
	
		System.out.println("Cars can drve");
	}

	@Override
	void stop() {
	
		System.out.println("Cars stop");
	}
	

	
	
	
}
 