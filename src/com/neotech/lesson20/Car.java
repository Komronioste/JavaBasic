package com.neotech.lesson20;

public class Car {

	
	String model, brand;
	int year;
	
	public void printDetails()
	{
		System.out.println("I have a " + year + " " + model + " of " + brand);
	}
	
	Car(String carModel, String carBrand, int carYear)
	{
		System.out.println("I am creating an object with parameters");
		model = carModel;
		brand = carBrand;
		year = carYear;
		
	}
	
	
//	public	String[] array = {"Tesla", "BMW", "Toyota", "Mercedes", "Fiat"};
//	public  String[] objectArray = {"a", "b", "c", "d",	"e"}; 	
//	
//	public declareObject()
//	{
//		for (int i = 0; i < array.length; i++)
//		{
//			Car array[1] = new Car(objectArray[1]);
//		}
//	}


	//////////////////////////////////////////
	public static void main(String[] args) {
		
		
	Car c = new Car("Model 3", "Tesla", 2021);
		
				c.printDetails();

	}

}
