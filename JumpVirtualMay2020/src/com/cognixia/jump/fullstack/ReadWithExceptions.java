package com.cognixia.jump.fullstack;

import java.util.Scanner;

public class ReadWithExceptions {
	
	public static void main(String[] args) {

		// We need to make a Scanner tool to get input
//			Scanner input = new Scanner(System.in);
//			int userInput = 0;
//			// Prompt the user for input
//			System.out.println("Please enter a number: ");
//			// Read the user input
//			// try
//			try {
//				userInput  = input.nextInt();
//			} catch (Exception e) {
////				e.printStackTrace();
//				System.out.println("please enter a numbr");
//			} finally {
//				input.close();
//			}
////			System.out.println(userInput);
////			String userInput = input.nextLine();
//			int userInput1 = input.nextInt();
//			
//			// Print the input to show that we stored / received it
//			System.out.println(userInput);
//			System.out.println(userInput1);
//			// Close the input
////			input.close();

//		 We need to make a Scanner tool to get input
//		Scanner input = new Scanner(System.in);
		int userInput = 0;
		Scanner input = new Scanner(System.in);

		while (true) {

			input = new Scanner(System.in);
			System.out.println("Please enter a number: ");
			boolean valid = false;

			try {
				valid = input.hasNextInt();
				userInput = input.nextInt();
			} catch (Exception e) {
				System.out.println("please enter a numbr");
			} finally {
				System.out.println("We are done");
				if (valid) {
					assert userInput > 0 : "please not negative";
					input.close();
					return;
				}
			}

//		System.out.println(userInput);
//		String userInput = input.nextLine();
//		int userInput1 = input.nextInt();

			// Print the input to show that we stored / received it
//		System.out.println(userInput);
//		System.out.println(userInput1);
			// Close the input
//		input.close();
		}
	}
}
