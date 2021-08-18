package com.neotech.lesson23;

public class ParentChildTest {

	public static void main(String[] args) {


		Parent p = new Parent();
		
	//	p.hello();     cannot call it because PRIVATE
		p.bye();
		
		Child ch = new Child();
		
		ch.bye();
		

	}

}
