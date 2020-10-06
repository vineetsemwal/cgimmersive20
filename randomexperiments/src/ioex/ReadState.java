package ioex;

import java.io.*;

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
            Customer customer=(Customer)object;
            System.out.println("saved customer fetched back="+customer.getId()+"-"+customer.getName());
         }
         catch (IOException e){
             e.printStackTrace();
         }
         catch (ClassNotFoundException e){
             e.printStackTrace();
         }
    }
}
