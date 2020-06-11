package com.cognixia.jump.fullstack.classesAndObjects;

import java.util.Arrays;

public class ArrayMatching {

	public static void main(String[] args) {
		// declaring my arrays
		int [] arr1 = {1,3,5,7,9};
		int [] arr2 = {5,3,7,1,9};
		// if statement to verify the 2 arrays  
		if(arr1.equals(arr2));{
			// ascending order
			// matching arrays
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			
		}
		// printing out the 2 arrays and making sure their equal
			System.out.println(Arrays.equals(arr1, arr2));
	}

}
