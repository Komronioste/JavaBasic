package com.neotech.lesson14;

public class Car {   // Car is a class
	
	
	//features (properties) of the class Car: 
	//these are declared outside/before main method.
	String make;
	String model;
	String color;
	int year;
	int maxSpeed;
	
	void drive()  // these are behaviors/methods
	{
		System.out.println("this car can drive"); // this will print automatically if this method is used 
	}
	void stop()  //void means return type. void means empty return. void doesnt give anything back.
	{
		System.out.println(make + " can stop");
	}
	void transportPeople()
	{
		System.out.println(make + " " + model + " transports people ");
	}
	

	//primitive data types: int, long, byte, short...
	//non-primitive data types: String, Car, Scanner, array
	
		public static void main(String[] args) {                       // <<<<<<<<<<<<------------------------------ main method is here!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			
			//declare ints
			int a =5;
			
			//declare a string
			
			String name = "Sabah";
			
			//another way to declare String
			
			String name2 = new String("Mufasa");
			
			//creating an object of class Car
			Car car1 = new Car();
			//1. declare an object of class Car ---> Car car1;
			//2. instantiation ( creating new ) ---> new
			//3. Initialization (value) ---> Car();
			
			car1.color = "Black";
			car1.make = "BMW";
			car1.model = "X5";
			car1.year = 2021;
			
			//car2 is an object of class Car()
			Car car2 = new Car();
			car2.make = "Toyota";
			car2.model = "Rav4";
			car2.color = "White";
			car2.year = 2021;
			
		}

	}


