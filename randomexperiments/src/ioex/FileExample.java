package ioex;

import java.io.File;

public class FileExample {

    public static void main(String args[]){
        String path="/home/vineet/Documents/experiments";
        File file=new File(path);
        boolean isDir=file.isDirectory();
        boolean isFile=file.isFile();
        String name=file.getName();
        boolean isWritable= file.canWrite();
        System.out.println("name ="+name);
        System.out.println("is file="+isFile);
        System.out.println("is dir="+isDir);
        System.out.println("is writable="+isWritable);
        if(isDir){
          File children[]=  file.listFiles();
          System.out.println("no of files inside directory="+children.length);
            for (File child:children){
                System.out.println(child.getName());
            }
        }

    }
}
