package notTheSamepackage;

public class Bike {

	// Composition Bike Has-a wheel
	public Wheel wheel;
	
	// Constructor 
	public Bike () {
		
		this.wheel = new Wheel();
		
	}
	
	
}
