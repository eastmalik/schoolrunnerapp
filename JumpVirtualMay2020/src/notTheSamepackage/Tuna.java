package notTheSamepackage;

public class Tuna {
	
	private String girlName;
	
	// constructor method = allow you use to use it when you make an object as a parameter
	public Tuna(String name) {
		girlName = name;
	}
	
	// making a method to set the name.
	public void setName(String name) {
		girlName = name;
	}
	
	// making a method to get the name from the user 
	public String getName() {
		return girlName;
	}
	public void saying() {
		System.out.printf("your first gf was %s,", getName());
	}
}
