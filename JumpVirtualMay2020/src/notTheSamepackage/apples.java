package notTheSamepackage;

import java.util.Scanner;

class apples {
	public static void main(String[] args) {
		
//		Scanner input = new Scanner(System.in);
//		
//		Tuna tunaObject = new Tuna();
//		
//		System.out.println("Enter a name of first gf here: ");
//		 // what that user types in will be stored
//		// this takes what the user enters and stores it
//		String temp = input.nextLine();
//		tunaObject.setName(temp);
//		tunaObject.saying();
		 Tuna tunaObject = new Tuna("Kelsey");
		 Tuna tunaObject2 = new Tuna("nicole");
		 tunaObject.saying();
		 tunaObject2.saying();
	}
}
