package notTheSamepackage;

public class JSUmelloSection {
	// declared my stirng to be public and named it
	public String SectionName;
	
	// made a method to set the name 
	public void setName(String name) {
		
		this.SectionName = name;
		
	}
	
	// made a get method to get the name that was set
	public String getName() {
		return SectionName;
	}
	public void saying() {
		System.out.printf("your section name is %s", SectionName);
	}
}
