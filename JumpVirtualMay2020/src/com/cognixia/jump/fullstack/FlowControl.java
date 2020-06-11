package com.cognixia.jump.fullstack;

import java.util.Scanner;

public class FlowControl {

	public static void main(String[] args) {
		       
				// start UserInput
		// We need to make a Scanner tool to get input
				Scanner input;
				boolean valid;
				
				do {
					// Prompt the user for input
					System.out.println("Please enter a number: ");
					
					// re-initialize the scanner
					input = new Scanner(System.in);
					
					// verify the right kind of input
					valid = input.hasNextInt();
					System.out.println(valid);
					
					// we only read the user input if it is valid
					if(valid) {
						// this is the actual reading 
						int userInput = input.nextInt();
					}
				} while (!valid);
				//Flow Control Demo Starts here:
				
				// Conditionals (If and Switch)
				
//				boolean condition = userInput >= 0;
//				
//				if (condition) {
//					System.out.println("Your number is Positive: ");
//				}
////				if (userInput > 50) {
////					System.out.println("Your in the magic range: ");
////				}
//				else {
//					System.out.println("Your number is Negative: ");
//				}
//				
				// Switch
				
				switch (userInput) {
				case 1:
					System.out.println("Home Menu: ");
					break;
				case 2:
					System.out.println("User Settings: ");
				default:
					System.out.println("No Options valid: ");
				}
				
				// similar code with if
//				if(userInput <= 5) {
//					if (userInput > 1) {
//						if(userInput %2 ==0) {
//							System.out.println("Target Range: ");
//						}
//					}
//					 
//				}
				
				// Loops
				// While loop
				
//				int counter = 0;
				
				
//				while(counter < 10) {
//					System.out.println(counter);
//					counter++;
//				}
				
//				while(userInput < 0){
//					System.out.println("Enter a number: ");
//					userInput = input.nextInt();
//					System.out.println(userInput);
//				}
				
				// Do While Loop
				
//				do {
//					
//					System.out.println("Enter a Positive number only: ");
//					userInput = input.nextInt();
//					System.out.println("Iterating through Do-while");
//			
//				} while (userInput < 0);
//				
//				
				// Print the input to show that we stored / received it
//				System.out.println(userInput);
				
				// For Loop 
				
				for(int i = 0; i < 10; i++) {
					System.out.println(i);
				}
				
				
				for(int i = 9; i >=0; i-= 2) {
					System.out.println(i);
				}
				
				// Sample Code from Powerpoint
				boolean condition = true;
				for(int i = 1; condition; i += 4) {
					if (i % 3 == 0) {
						condition = false;
					}
					System.out.println(i);
				}
			
				// Nested for loop
				for(int i = 0 ; i < 10; i++) {
					
					for(int j = 0; j < 10; j++) {
						System.out.println(i + ":" + j);
					}
					
				}
				// Close the input
				input.close();

	}

}
