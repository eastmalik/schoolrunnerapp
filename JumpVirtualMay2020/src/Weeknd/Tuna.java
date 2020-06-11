package Weeknd;

public class Tuna extends foods {
	
	// attributes
	String type;
	String PaymentMethod;
	double price; 
	boolean inStock;
	
	// Constructor
		Tuna() {
		System.out.println("this is our tuna");
		
	
		
			}
		Tuna(String TunaSalad, double price) {
		
		this.type = "Tuna Salad";
		this.price = price ;
		
		
	}




	// this is the verb aka method 
	
	public void checkOut() {
		
		System.out.println("Scan item : " + price);
	}
		
	
		
		
	public void PayNow() {
		
		this.PaymentMethod = "Cash or Card ";
		System.out.println("PayNow : " +  PaymentMethod );
		
	}
	

	
}
