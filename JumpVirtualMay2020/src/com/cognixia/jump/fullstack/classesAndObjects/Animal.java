package com.cognixia.jump.fullstack.classesAndObjects;


public class Animal {
	
	// Attributes and access modifiers 
	
	//top down most are least restricted/ most avaiable
	// to least avaiable
//	private int publicAt;
//	private int defaultAt; //this is default access
	private  int weight;
	private String name;
	
	
	// Constructors
	Animal() {
		this.weight = 0;
	}
	
	Animal(int weight){
		this.weight = weight;
	}
	
	Animal(int weight, String name){
		this.weight = weight;
		this.name = name;
		
	}
	
	// Methods = The Action
	// We'll use this for overriding, 
	public void move() {
		System.out.println("The Aniaml move...");
		
	}
	
	public int noises(String sound, int volume) {
		System.out.println("The animals makes many noises" +" "+ sound + " "+ "at Volume" 
				+volume);
		return volume;
		
	}
	
	// method overload
	public void move(int x, int y) {
		System.out.println("Animal moves x distance:" + x + "Animal moves y distance:" + y);
			
	}
	public int move(int x) {
		System.out.println("Animal move x distance: " + x);
		return 1;
	}

	// this is a getter method to get the weight
	public int getweight() {
		return weight;
	}
	
	// this is a getter method to get the name
	public String getname() {
		return name;
	}
		// this is a setter method to set the name
	public void setname(String name) {
		this.name = name;
	}
	// this is a setter method to set the weight
	public void setweight(int weight) {
		this.weight = weight;
	}

	
	
//	public void showStatus() {
//		System.out.println(weight + " " + name);
//	}
}

