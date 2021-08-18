package com.neotech.lesson23;

public class AnimalTest {

	public static void main(String[] args) {


		Animal obj = new Tiger();  //UpCASTING. Will use parent's methods but if it was overridden, it will call overridden methods.
		
		obj.eat();  // it will check if tiger class has this method ( check for overriding ). If Tiger has it, it will run, otherwise method from Animal will run. CANNOT call methods that are not present in Animal.
		obj.sleep();
	//	obj.run();  run(); is not defined in Animal
		obj.cry();   
		System.out.println(obj.a); // variables are not overridden
		
		
		Cub cub = new Cub();
		
		cub.cry();   // Will inherit both parents and grandparents methods
		cub.eat();
		cub.run();
		cub.sleep();
		
	}

}
