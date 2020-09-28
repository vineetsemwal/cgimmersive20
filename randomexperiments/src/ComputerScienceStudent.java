
public class ComputerScienceStudent extends Student{
	String laptop;
    String language;
    
    ComputerScienceStudent(int id, String name, String laptop, String language){
    	super(id,name);
    	this.laptop=laptop;
    	this.language=language;
 	   System.out.println("after initialization in ComputerScienceStudent ctr");

    }
    
    String getLaptop() {
    	return laptop;
    }
    
    void setLaptop(String laptop) {
    	this.laptop=laptop;
    }
    
    String getLanguage() {
    	return language;
    }
    
    void setLanguage(String language) {
    	this.language=language;
    }
    
    
}
