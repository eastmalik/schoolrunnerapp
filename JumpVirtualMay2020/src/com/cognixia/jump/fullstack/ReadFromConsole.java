package com.cognixia.jump.fullstack;

import java.util.Scanner;

public class ReadFromConsole {

	public static void main(String[] args) {
		
		// one way to make comments - only for a single line
		
// 		mult line comment used in
// 		eclipse
		
		/* - start mult line comment
		 * 
		 
		will finish the multi line comment -> */
		
		// declaring and initializing variable (primitives)
			// data type - variable name; ( just declaring)
		int ourInt;
		
		// Initialization -> variable name = value;
		ourInt = 5;
		
		int ourInt2 = 5;
		
		// Primitive data types
			// Whole numbers (integers of different sizes);
		int i = 1;
		byte b = 2;
		short s = 3;
		long l = 100000000;
			// Decimals
		float f = 5.00f;
		double d = 5.00;
		
		// Non numeric
		char c = 'c';
		boolean bn = true;
		
		
		// Not primitive - Object
		String output = "Hello World";
		
		// Show visually a difference between a prim. and obj. in IDE
			// primitive
			// bn.  -> no valid, dot(.) operator does nothin
		
			// Objects
			output.charAt(1); // this is just to show the . of and obj.
		
		System.out.println(output);
		
		// Conclude code basics Demo
		
		// start UserInput
		
		 
		System.out.println(c);
		
		// We need to make a Scanner tool to get input
		Scanner input = new Scanner(System.in);
		
		// Prompt the user for input
		System.out.println("Please enter a number: ");
		// Read the user input
		String userInput = input.nextLine();
		int userInput1 = input.nextInt();
		
		// Print the input to show that we stored / received it
		System.out.println(userInput);
		System.out.println(userInput1);
		// Close the input
		input.close();
		
		
		
//		int userInput = 0;
//		Scanner input = new Scanner(System.in);
//
//		while (true) {
//
//			input = new Scanner(System.in);
//			System.out.println("Please enter a number: ");
//			boolean valid = false;
//
//			try {
//				valid = input.hasNextInt();
//				userInput = input.nextInt();
//			} catch (Exception e) {
//				System.out.println("please enter a numbr");
//			} finally {
//				System.out.println("We are done");
//				if (valid) {
//					input.close();
//					return;
//				}
//			}

		
		
		

	}

}
