package com.neotech.lesson21;

public class Shape {

	double radius;

	Shape(double radius) {

		this.radius = radius;

	}

}

class Circle extends Shape {

	Circle(double radius) {
		super(radius);

	}

	public void area() {
		System.out.println("Area of the circle is " + (3.14 * radius * radius));
	}

}
