package ioex;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteState {

    public static void main(String args[]) {
     WriteState example=new WriteState();
     example.write();
    }

    public void write() {
        Customer customer1 = new Customer(1, "bhuratan");
        Customer customer2=new Customer(2,"avichal");
        List<Customer>list=new ArrayList<>();
        list.add(customer1);
        list.add(customer2);
        File output = new File("/home/vineet/Documents/experiments/writestate");
        try(
                OutputStream fos=new FileOutputStream(output);
                ObjectOutputStream objos=new ObjectOutputStream(fos);
        ){
            objos.writeObject(list);//serializing object of arraylist
        }
        catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("object saved in the file");

    }

}
