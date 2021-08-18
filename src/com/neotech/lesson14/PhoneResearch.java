package com.neotech.lesson14;

public class PhoneResearch {

	public static void main(String[] args) {
		
		Phone p1 = new Phone();
		Phone p2 = new Phone();
		Phone p3 = new Phone();
		
		p1.make = "Apple";
		p1.model = "iPhone 13";
		p1.color = "White";
		p1.price = 1299.99;
		p1.displaySize = 16.2;
		
		p2.make = "Samsung";
		p2.model = "Galaxy S20";
		p2.color = "Black";
		p2.price = 999.99;
		p2.displaySize = 18.1;

		p3.make = "Nokia";
		p3.model = "6610";
		p3.color = "Dark blue";
		p3.price = 99.59;
		p3.displaySize = 4.7;
		
		p1.generalInfo();
		p1.phoneCalls();
		p1.reliability();
		
		p2.generalInfo();	
		p2.phoneCalls();
		p2.reliability();
		
		p3.generalInfo();
		p3.phoneCalls();
		p3.reliability();
		
	}

}
