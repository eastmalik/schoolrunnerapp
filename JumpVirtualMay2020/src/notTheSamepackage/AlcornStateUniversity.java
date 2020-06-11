package notTheSamepackage;

public class AlcornStateUniversity {
	
	// declaring my school name
	public String AlcornStateUniversity;
	// make a method to get and set the name of the school
	public void setName(String name) {
		
		this.AlcornStateUniversity = name;
		
	}
	public String getName() {
		return AlcornStateUniversity;
	}
	
	// making a method
	public void saying() {
		System.out.printf("So the school you Attend is %s.", AlcornStateUniversity);
	}
	
	
}
