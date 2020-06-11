package notTheSamepackage;

public class JacksonStateUniversity extends AlcornStateUniversity{
	
	// declare my school name
	public String JacksonStateUniversity;
	
	public void setName(String name) {
		this.JacksonStateUniversity = name;
	}

	public String getName() {
		return JacksonStateUniversity;
	}
	
	// make a method 
	@Override
	public void saying() {
		System.out.printf("So the school you attend is: ", JacksonStateUniversity );
	}
}
