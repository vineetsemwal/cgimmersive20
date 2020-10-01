package randomexperiments.inheritance;

public class Student {

    public Student() {
        this(-1, "",0);
    }

   public Student(int id) {
        this(id, "",0);
    }

   public Student(int idArg, String nameArg,int age) {
        System.out.println("inside Student 2 args ctr");
        id = idArg;
        this.name = nameArg;
        this.age=age;
    }

    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private int age;
    
    
    public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
    public String toString() {
        String str = id + "-" + name;
        return str;
    }

    /**
     * Student st1=new Student(1,"shivam");
     * Student st2=new Student(1,"shivam");
     * boolean flag=st1.equals(st2);
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Student)) {
            return false;
        }
        Student that = (Student) obj;
        return this.id == that.id;
    }
	

}
