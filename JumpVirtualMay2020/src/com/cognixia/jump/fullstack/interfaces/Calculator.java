package com.cognixia.jump.fullstack.interfaces;

public interface Calculator {
	
	// attributes  to my calculator
	double PI = 3.14;
	
	// method for the sum of inputs 
	static int sum(int...inputs) {
		// declaring sum
		int sum = 0;
		// for loop / array
		for (int i: inputs) {
			sum+=i;
		}
		// returns the sum
		return sum;
	}

	default int multiply(int...input) {
		int product = 1;
		
		
		for (int i: input) {
			if(i == 0) {
				return 0;
			}

			product *= i;
		}
		
		return product;
	}
}
