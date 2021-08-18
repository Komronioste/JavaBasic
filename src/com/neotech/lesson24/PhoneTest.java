package com.neotech.lesson24;

public class PhoneTest {

	public static void main(String[] args) {
		
		
		
	//	Phone ph = new Phone();  CANNOT create object of an abstract class
		
		Phone iphone = new iPhone();  // we can indirectly create objects of abstract class by using upcasting
		

		iphone.call();
		iphone.text();
		iphone.playMusic();
		iphone.takePicture();
		
		Samsung samsung = new Samsung();
		
		Samsung sm = (Samsung) samsung; //down casted to use child methods
		
		sm.playGames();
		sm.playMusic();
		sm.takePicture();
		
		
	}

}
