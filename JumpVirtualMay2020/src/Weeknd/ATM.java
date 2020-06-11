package Weeknd;

import java.util.Scanner;

import Weeknd.HomeMenu.Balance;

public class ATM {

	public static void main(String[] args) {
		
		Scanner  input;
		boolean valid;
		boolean restart = false;
		float balance = 14455.00f;
		int userInput = 0;
		
		do {
	// Prompt the user for input
	System.out.println("Press 1 for your Balance: ");
	System.out.println("Press 2 for withdraws:");
	System.out.println("Press 3 for deposit:");
	
	// re-initialize the scanner
	input = new Scanner(System.in);
	
	// verify the right kind of input
	valid = input.hasNextInt();
	
	
	
	// we only read the user input if it is valid
	if(valid) {
		// this is the actual reading 
	 userInput = input.nextInt();
	}
} while (!valid);
		
		
		
		switch (userInput) {
		
		case 1:			
			System.out.println("Balance: " + userInput);
			// Made a HomeMenu Object
			Balance userBalance = new Balance();
			// Calling the HomeMenu Class
			Balance.callBalance();
			break;
			
		case 2:
			System.out.println("withdraws: " + userInput);
			break;
			
		case 3:
			System.out.println("deposit: " + userInput);
			Deposit deposit = new Deposit();
			float resultBalance = deposit.callDeposit(balance);
			
			System.out.println(resultBalance);
			break;
			
		default:
			System.out.println("No Options valid: " + userInput);
		}
		
		
		

		input.close();
		

	}

}


