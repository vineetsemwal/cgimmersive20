package ioex;

import java.io.*;
import java.util.List;

public class ReadState {
    public static void main(String args[]){
        ReadState example=new ReadState();
        example.readState();
    }
    public void readState(){
        File input = new File("/home/vineet/Documents/experiments/writestate");
         try(
                 InputStream inputStream=new FileInputStream(input);
                 ObjectInputStream oin=new ObjectInputStream(inputStream);
                 ){
            Object object =oin.readObject();
            List<Customer> list=(List)object;//since we serialized arraylist
            for (Customer customer:list) {
                System.out.println("saved customer fetched back=" + customer.getId() + "-" + customer.getName());
            }
         }
         catch (IOException e){
             e.printStackTrace();
         }
         catch (ClassNotFoundException e){
             e.printStackTrace();
         }
    }
}
