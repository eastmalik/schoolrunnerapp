package notTheSamepackage;

import java.util.Scanner;

public class SignUp {

	public static void main(String[] args) {
		String SchoolName;
		String Name;
		int address;
		int input;
		Scanner userInput = new Scanner(System.in);

		
		while (true) {
			System.out.println();
			System.out.println("1. Enter your name:");
			System.out.println("2. What is your address:");
			System.out.println("3. What is you school name:");
			
			
			input = userInput.nextInt();
			switch (input) {
			case 1:
				
				System.out.println("Thank You %s:");
				
				break;
			case 2:
				System.out.println("Great %s");
				break;
			}
			
			userInput.nextInt();
			userInput.close();
			return;
			

		}

	}

}
