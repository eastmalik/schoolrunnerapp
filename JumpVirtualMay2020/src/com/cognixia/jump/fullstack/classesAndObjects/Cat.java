package com.cognixia.jump.fullstack.classesAndObjects;

public class Cat extends Animal {
	// attributes with access modifiers 
	private String type;
	private int id;
	
	private static int count = 0;



	// constructors - you can call a parent constructor, but it is 
	// not directly inherited 
	public Cat(){
		super(0, "");

		// this cat1; or whatever object is being made;
		this.type = " ";
		count++;
		this.id = count;
	}
	


	Cat(int weight, String name){
		super(weight, name);
		this.type = " ";
		count++;
		this.id = count;
	}
	
	Cat(int weight, String name, String type){
		super(weight, name);
		this.type = type;
		this.type = " ";
		count++;
		this.id = count;
	}
	
	
	// override example
	@Override
	public void move() {
		System.out.println("The Cat Jumpped...");
	}
	
	@Override
	public int noises(String sound, int volume) {
		System.out.println("Cat makes a noise ." + " " + sound + " "
				+ volume);
		return volume;
		
	}
	
	@Override
	public void move(int x, int y) {
		System.out.println("cat moves x distance:" + x + "cat moves y distance:" + y);
			
	}
	@Override
	public int move (int x) {
		System.out.println("Cat moves x distance: "+ x);
		return 4;
	}
	
	
	public static void printCatCount() {
		System.out.print("Number of cats: " + count);
	}
	
	
	// Getter methods
	public int getId() {
		return id;
	}
	public static int getCount() {
		return count;
	}




	@Override
	public String toString() {
		return "Cat type=" + type + ", \n\t id=" + id + ", \n\t weight=" 
				+ getweight() + ", \n\t name =" + getname() ;
	}
	
}
