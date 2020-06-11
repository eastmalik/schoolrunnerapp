package com.cognixia.jump.fullstack;

import java.util.Scanner;

public class MorningChallenge {

	public static void main(String[] args) {
		
			
			// get user input
			Scanner input = new Scanner(System.in);
				System.out.println("Enter a number");
			// Reads user Input
			int userInput = input.nextInt();
			int sum = 0;
			if (userInput > 50) {
				System.out.println(userInput);
			}
			else {
			// for loop does the sum for numbers
			for (int i = 1; i <=100; i++) {
				if (i % userInput ==0) {
					sum += i;

				}
				
			}
				System.out.println("your sum was: " + sum);
			
				input.close();


		}
	}
}
