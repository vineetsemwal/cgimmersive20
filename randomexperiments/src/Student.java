
public class Student {
 
	Student(){	
	this(-1,"");
	}
	
	Student(int id){
		this(id,"");
	}
	
	Student(int idArg,String nameArg){
		System.out.println("inside Student 2 args ctr");
		id=idArg;
		this.name=nameArg;		
	}
	
	private int id;
	private String name;
	
	void setId(int id) {
		this.id=id;
	}
	
	int getId() {
		return id;
	}
	
	void setName(String name) {
		this.name=name;
	}
	
	String getName() {
		return name;
	}
	
	

}
