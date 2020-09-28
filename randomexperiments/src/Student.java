
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
