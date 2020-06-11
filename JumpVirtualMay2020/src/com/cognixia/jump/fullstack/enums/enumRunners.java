package com.cognixia.jump.fullstack.enums;

public class enumRunners {
// enums can be declared within classes, and have their own 
// modifiers
	private enum Days{
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}
	
	public static void main(String[] args) {
		
		// declaring my methods to use my enums
		daysRunner();
		gradeRunner();
//		cakeRunner();
		
	}
	
	public static void daysRunner() {
		System.out.println(Days.FRIDAY);
	}

	public static void gradeRunner() {
		
		// made a enum object below
		Grade grade = Grade.SENIOR;
		
		System.out.println(grade.ordinal());
		
		// print info bound to the enums value
		System.out.println(grade.name());
		
		// each of the enums have access to the hello method
		grade.hello();
		
		// switch with enums
		switch(grade) {
		case FRESHMAN:
			System.out.println("First year in high school");
			break;
		case SOPHMORE:
			System.out.println("Second year in high school");
			break;
		case JUNIOR:
			System.out.println("Third year in high school");
			break;
		case SENIOR:
			System.out.println("Fourth year in high school");
			break;
		default:
			System.out.println("Not a valid grade level");
			break;
		}
	}
	public static void cakeRunner() {
		
	}
}
