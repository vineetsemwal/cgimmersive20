package randomexperiments.staticexp;

public class Customer {

    public Customer(String name){
        this.name=name;
    }

    private String name;

    public static void display(Customer customer){
       System.out.println("customer name is "+ customer.name);
    }

}
