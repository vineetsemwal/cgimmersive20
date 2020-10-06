package ioex;

import java.io.*;

public class WriteState {

    public static void main(String args[]) {
     WriteState example=new WriteState();
     example.write();
    }

    public void write() {
        Customer customer1 = new Customer(1, "bhuratan");
        File output = new File("/home/vineet/Documents/experiments/writestate");
        try(
                OutputStream fos=new FileOutputStream(output);
                ObjectOutputStream objos=new ObjectOutputStream(fos);
        ){
            objos.writeObject(customer1);
        }
        catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("object saved in the file");

    }

}
