package notTheSamepackage;

import java.util.Scanner;

public class SchoolRunner {

	public static void main(String[] args) {
		
		// make objects to use

				AlcornStateUniversity ASU = new AlcornStateUniversity();
//		JacksonStateUniversity JSU = new JacksonStateUniversity();
		while (true) {
			Scanner input = new Scanner(System.in);

		System.out.println("Enter your school Name: ");
		boolean valid = false;
		
		String temp = input.nextLine();
		System.out.println("\nEnter another school name:");
		
		
		ASU.setName(temp);
		ASU.saying();
		
		input.close();
		return;
		}
		
	}
}
