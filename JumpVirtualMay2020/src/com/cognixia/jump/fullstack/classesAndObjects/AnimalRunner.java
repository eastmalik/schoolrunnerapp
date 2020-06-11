package com.cognixia.jump.fullstack.classesAndObjects;

public class AnimalRunner {

	public static void main(String[] args) {
		
		// Primitive
	
		
		// Object creation
		
//		System.out.println(Cat.getCount);
//
		Cat cat1 = new Cat( 10, "blue", "simeas");
		Cat cat2 = new Cat( 11, "green", "simeas");
		Cat cat3 = new Cat( 12, "yellow", "simeas");
		Cat cat4 = new Cat( 13, "oragne", "simeas");
		
		Animal anim1 = new Animal();
		anim1.move();
		cat1.move();
		anim1.noises("Animal random noise", 12);
		int exec = cat1.noises("Mow-mow", 21);
		
		cat1.move(12, 15);
		cat1.move(12, 12);
		anim1.move(10, 11);
		anim1.move(2);
		cat1.move(1);
		cat1.move(4);
//		
//		
//		
		System.out.println(cat1.getweight() + " " + cat1.getname() +
				" " + cat1.getId());
		
		System.out.println(cat2.getweight() + " " + cat2.getname() +
				" " + cat1.getId());
		System.out.println(cat3.getweight() + " " + cat3.getname() +
				" " + cat1.getId());
		System.out.println(cat4.getweight() + " " + cat4.getname() +
				" " + cat1.getId());
//		
//		System.out.println(cat2.count);
		System.out.println(cat2.getname());
		
		Cat.printCatCount();
		Cat.getCount();
		

	}

}
