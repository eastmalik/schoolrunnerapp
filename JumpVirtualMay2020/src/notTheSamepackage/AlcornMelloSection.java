package notTheSamepackage;

import java.util.Scanner;

public class AlcornMelloSection {

	public static void main(String[] args) {
		
		// making my scanner
		Scanner input = new Scanner(System.in);
		
		// making my JSUmelloSection Object
		JSUmelloSection JSU = new JSUmelloSection();
		
		//Prompt the user to name they section
		System.out.println("Enter your section name:");
		
		// Store what the user typed
		String sections = input.nextLine();
		JSU.setName(sections);
		JSU.saying();
		

	}

}
