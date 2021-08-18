package com.neotech.lesson22;

public class AdditionTest {

	public static void main(String[] args) {
		
		
		Addition obj = new Addition();
		
		obj.add(4, 5);
		
		//method overloading
				obj.add(3, 5, 2);

		obj.add("Komron", 5);
	}

}
