package com.cognixia.jump.fullstack.strings;

public class StringDemo {

	public static void main(String[] args) {
		
		//String pool demo(memory)
		String s1 = "s1";
		String s2 = "s2";
		String s3 = "s1";
		String s4 = new String("s1");
		String s5 = s4;
		
		// using hashcode can't distinguish memory in a string 
		System.out.println(s1.hashCode()+ " " + s2.hashCode()+ " "
		+ s3.hashCode() + " " + s4.hashCode() + " " + s5.hashCode());
		System.out.println();
		
		// == checks for the same address only
		System.out.println((s1 == s2) + " "+ (s1 ==s3) + " " + (s1 == s4) + " "+
		 (s1 == s5) + " "+ (s4 ==s5));
		System.out.println();
		
		//.equals checks the actuals contents of the string
		System.out.println(s1.equals(s2)+ " " + s1.equals(s3) + " " 
				+ s1.equals(s4)+ " " + s1.equals(s5) + " " 
				+ s4.equals(s5));
		System.out.println();
		
//		//
//		System.out.println(s1.contentEquals(s2)+ " "+ s1.contentEquals(s3)+ 
		// checking .contentEquals 
 		//String instance methods
		System.out.println();
		String testString = "someone give me a sentence here.";
		// charAt returns a character
		System.out.println(testString.charAt(5));
		// indexof returns a integer
		System.out.println(testString.indexOf('e', 9));
		
		System.out.println(testString.substring(5));
		
		// string static methods
		boolean b = true;
		boolean c = true;
		String s = String.valueOf(b);
		String x = String.valueOf(c);
		System.out.println(s+x);
		
		
		// loop through String to find something. file, anything
		for(int i = 0; i < testString.length(); i ++) {
			
			char[] temp = testString.toCharArray();
			System.out.println(testString.charAt(i));
			System.out.println(temp[i]);
			System.out.println(testString.toCharArray()[i]);
		}
		
		// Stringbuilder and StringBuffer
		// putting strings together to get an output
		StringBuilder builder = new StringBuilder("Starter String");
		StringBuilder builder2 = new StringBuilder();
		// Stringbuffer
		StringBuffer buff = new StringBuffer(builder);
		System.out.println(buff);
	
		
		// reversing a string to read backwards
		System.out.println(builder.reverse().toString());
		
		
		builder2.append("hello world");
		System.out.println(builder2);
		
		System.out.println(sum(1,2,3,4));
		System.out.println(sum(2,4));
	}
	
	// show elipse ...
	
	//sum functions to taking in 2 and add in 3 and add in 4 
	//a number to pass in every time
	// calculator 
	public static int sum(int... inputs) {
		int sum = 0;
		for(int i : inputs) {
			sum += i ;
		}
		return sum;
	}
	
	// pass by reference and pass by value
	
	

}
