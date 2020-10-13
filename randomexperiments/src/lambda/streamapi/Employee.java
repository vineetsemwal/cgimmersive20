package lambda.streamapi;

public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int sal){
        this.name=name;
        this.salary=sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
