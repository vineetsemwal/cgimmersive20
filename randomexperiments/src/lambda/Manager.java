package lambda;

public class Manager {
    private String name;

    private int age;

    public Manager(){
        this.name="";
        this.age=-1;
    }

    public Manager(String name){
        this.name=name;
    }

    public Manager(String name, int age){
        this.name=name;
        this.age=age;
    }


    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

}
