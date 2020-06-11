package com.cognixia.jump.fullstack.classesAndObjects;



public class Calculator {
	// Attributes
	int one;
	int two;
	
	static int opsCount = 0;
	
	// code block - instance
//	{
//		System.out.println("this is the code block");
//	}
//	static {
//		System.out.println("this is the static block");
//	}
//	// Constructors 
	Calculator(){
		System.out.println("this is the constructor");
	}
	Calculator(int one, int two){
		
		this.one = one;
		this.two = two;
		
	}
	// methods
	public static void sum(int one, int two) {
		System.out.println(one + two);
		opsCount++;
	}
	
	
	// Make a sum method for 2 numbers that take them as a parameters
	// and then returns the sum to itself
	

	public static int sum1(int one, int two) {
		// TODO Auto-generated method stub
		System.out.println(one+two);
		int sum = one + two;
		opsCount++;
		return sum;
	}
	
	public static void multiple(int one, int two) {
		System.out.println(one * two);
		System.out.println("this is our static method");
		opsCount++;
	}
//	 the () are the parameters - which is the data in
	public static double divide(double dividen, double divisor) {
		System.out.println();
		double quotient = dividen / divisor;
		opsCount++;
		// the return is the data out
		return quotient;
	}
	



	
}
