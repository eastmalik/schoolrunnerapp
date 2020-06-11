package com.cognixia.jump.fullstack.classesAndObjects;


import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		// declaring array 
		int [] intArr1;
		int intArr2[];
		
		Cat [] cats;
		
		// initializing = some values for the array i declared
		// my array now has a value 0f 5 so technically it will
		// be 4 blocks because arrays start at 0
		intArr1 = new int[5];
		cats = new Cat[5];
// not valid int [] intArr3 = {50,40,35,45,10}; <- not valid 
		
		// declare and initialize
		
		int [] intArr3 = {50,40,35,45,10};
		
		Cat[] litter = {new Cat(10, "Mittins", "Taddy"), new Cat(), new Cat()};
		
		intArr1[2] = 100;
		
		// initial values
		System.out.println(Arrays.toString(intArr1));
		System.out.println(Arrays.toString(litter));
		
		// reading / writing / accessing array
		System.out.println(litter[0]);

		
//		litter[2]= null;
		
		// out of bounds
		//		System.out.println(litter[10]);
		
		// iterating / looping through array
		
			
			// traditional for loop
			for(int i = 0; i < intArr3.length; i++) {
				System.out.println(intArr3[i]);
			}
			
			for(int i = intArr3.length - 1; i >=0; i--) {
				System.out.println(intArr3[i]);
			}
			System.out.println("For reach loops \n");
			// for each loop
				// primitive array
			//data type of the individual array
			for(int element : intArr3) {
				if (element == 40) {
					element = 50;
				}
				System.out.println(element);
			}
			
			// test the write function for-each loop with prim
			System.out.println(Arrays.toString(intArr3));
			
				// array of objects
			// the data type need to reflect the array on the
			// left hand side
			for(Cat cat: litter) {
				if (cat.getname().equals("mittens")){
					
					
				
//					cat = new Cat(10, "overridden", "new cat");
					cat.setname("override");
					System.out.println("\ninside for- each loop");
					
				}
				
				
			System.out.println(cat);
			}
			
			System.out.println("\noutside for-each loop");	
			
			System.out.println(Arrays.toString(litter));
			
		// Homogerous and Heterogeneous Arrays (Inheritance)
			
			Animal[] animals = new Animal[3];
			
			
			animals[0] = new Animal();
			animals[1] = new Cat();
		
		// Array class static methods
		
//			Array.getInt(intArr3, 4);
			
		// Utility class - Arrays
		String output = Arrays.deepToString(litter);
			System.out.println(output);
			
	 // pass by reference and vlaue how the data
	// put in your method is beinig passed
	// making a copy of the data value for my method
	
		int a = 4;
		int b = 10;
		int[] ints = new int[2];
		ints[0] = a;
		ints[1] = b;
		
		swapInts(a,b);
		swapInts2(ints);
		System.out.println(ints[0] + "  " + ints[1]);
	// pass by reference is referring to the 
	// specific address in the heap memory not making a copy
		
		
			
			
			
			
	}
	public static void swapInts2(int[] ints) {
		// swapping values
		int temp = ints[0];
		ints[0]= ints[1];
		ints[1] = temp;
		System.out.println(ints[0] + " " + ints[1]);
	}
	public static void swapInts(int a, int b) {
		// swapping values
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a + " " + b);
	}
//	public static int[] swapInts(int a, int b) {
//		int[] arr1 = {a, b};
//		return arr1;
//	}
}
