package ioex;

import java.io.*;

public class FileCopyUsingCharStreamWithTryResource {

    public static void main(String args[]) {
        FileCopyUsingCharStreamWithTryResource example = new FileCopyUsingCharStreamWithTryResource();
        File input = new File("/home/vineet/Documents/experiments/input.txt");
        File output = new File("/home/vineet/Documents/experiments/output.txt");
        example.readWrite(input, output);
    }

    void readWrite(File inputFile, File outFile) {
        try {
            InputStreamReader reader = new FileReader(inputFile);// reader wraps/use inputstream
            OutputStreamWriter writer= new FileWriter(outFile);//writer wraps/use outputstream
            int readCharacter;// will contain the character which we will read
            while ((readCharacter = reader.read()) > 0) {
                writer.write(readCharacter);

            }
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    void close(InputStream stream){
        try{
            stream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    void close(OutputStream stream){
        try{
            stream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    void close(Reader reader) {
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void close(Writer writer) {
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
