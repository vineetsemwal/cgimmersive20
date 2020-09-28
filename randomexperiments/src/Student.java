
public class Student {
 
	Student(){	
	this(-1,"");
	}
	
	Student(int id){
		this(id,"");
	}
	
	Student(int idArg,String nameArg){
		id=idArg;
		this.name=nameArg;
		
	}
	
	int id;
	String name;
	
	int getId() {
		return id;
	}
	
		
	String getName() {
		return name;
	}
	
	

}
