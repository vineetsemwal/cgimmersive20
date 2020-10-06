package ioex;

import java.io.*;

public class ReadWriteCharacter {

    public static void main(String args[]){
        ReadWriteCharacter example=new ReadWriteCharacter();
        example.readWrite();
    }

    void readWrite(){
        InputStream inputStream=System.in;//default inputstream
        InputStreamReader reader=null;
        OutputStream outputStream=System.out;//defualt outputstream
        OutputStreamWriter writer=null;
        try {
           reader= new InputStreamReader(inputStream);// reader wraps/use inputstream
            writer=new OutputStreamWriter(outputStream);//writer wraps/use outputstream
            int readCharacter;// will contain the character which we will read
            System.out.println("Enter Data");
            while ((readCharacter = reader.read()) != 'z') {
                writer.write(readCharacter);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        finally {
          close(reader);
          close(writer);
        }

    }

    void  close(Reader reader){
        try {
            reader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    void  close(Writer writer){
        try {
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }


}
