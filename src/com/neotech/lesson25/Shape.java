package com.neotech.lesson25;

public interface Shape {

//	Create an Interface 'Shape' with undefined methods as
//	calculateArea and calculatePerimeter. Create 2 classes
//	Circle & Square that implements functionality defined in the
//	Shape Interface. Test your code.

	void calculateArea(double a);

	void calculatePerimeter(double a);

}

class Circle implements Shape {

	@Override
	public void calculateArea(double a) {

		System.out.println("Circles are is: " + a * a * 3.14);

	}

	@Override
	public void calculatePerimeter(double a) {

		System.out.println("Circle's circumference is: " + 2 * 3.14 * a);

	}

}

class Square implements Shape {

	@Override
	public void calculateArea(double a) {

		System.out.println("Square area is: " + a * a);

	}

	@Override
	public void calculatePerimeter(double a) {

		System.out.println("Square perimeter is: " + 4 * a);

	}

}
