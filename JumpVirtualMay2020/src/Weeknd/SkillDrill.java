package Weeknd;

import java.util.Scanner;

public class SkillDrill {

	public static void main(String[] args) {
		
		// creating a object aka a scanner
		Scanner DrillInput = new Scanner(System.in);
		String Player = " ";
		
		
		// Prompt user for input
		System.out.println("Name a basketball drill: ");
		
		String Player1 = DrillInput.nextLine();
		
		System.out.println(Player1);
		
		System.out.println("Try something new");
		
		Player = DrillInput.nextLine();
		
		System.out.println(Player);
		
		DrillInput.close();
	}

}
