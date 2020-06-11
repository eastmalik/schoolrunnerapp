package com.cognixia.jump.fullstack.interfaces;

public class Runner {

	public static void main(String[] args) {
		
		
		final int x;
		
		x = 4;
		//making my object
		WolfHybrid hybrid = new WolfHybrid();
		
		// implementing the move method for my wolf
		hybrid.move();
		hybrid.bark();
		
		// Java 8 interface
		// printing the Sum output
		System.out.println(Calculator.sum(2,4,6,8));
		// printing the calculation for PI
		System.out.println(Calculator.PI);
		
		System.out.println(hybrid.multiply(2,4,6));

	}

}
