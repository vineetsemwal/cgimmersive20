package randomexperiments.inheritance;

public class ComputerScienceStudent extends Student{
	private String laptop;
    private String language;
    
     public ComputerScienceStudent(int id, String name,int age, String laptop, String language){
    	super(id,name,age);
    	this.laptop=laptop;
    	this.language=language;
 	   System.out.println("after initialization in ComputerScienceStudent ctr");

    }
    
    public String getLaptop() {
    	return laptop;
    }
    
    public void setLaptop(String laptop) {
    	this.laptop=laptop;
    }
    
    public String getLanguage() {
    	return language;
    }
    
    public void setLanguage(String language) {
    	this.language=language;
    }
    
    
}
