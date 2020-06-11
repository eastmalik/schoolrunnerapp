package com.cognixia.jump.fullstack.enums;

public enum Grade {

	FRESHMAN, SOPHMORE, JUNIOR, SENIOR;

// all enums constructor is ran once for each value
// this statement will print 
	Grade() {
		// this statement will print out a student is a particular year in college
		System.out.println("\nA" +" " + this.toString()+ " "+ " has been in high school for "
				+ (this.ordinal()+ 1) + " year(s)");
		}
	
// this method is available to all enums of this type
	public void hello() {
		System.out.println("Hello this student is a:" + this.toString());
	}
}
