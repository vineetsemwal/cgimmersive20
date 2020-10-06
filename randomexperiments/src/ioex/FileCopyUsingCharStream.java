package ioex;

import java.io.*;

public class FileCopyUsingCharStream {

    public static void main(String args[]) {
        FileCopyUsingCharStream example = new FileCopyUsingCharStream();
        File input = new File("/home/vineet/Documents/experiments/input.txt");
        File output = new File("/home/vineet/Documents/experiments/output.txt");
        example.readWrite(input, output);
    }

    void readWrite(File inputFile, File outFile) {
        InputStreamReader reader = null;
        OutputStreamWriter writer = null;
        try {
            reader = new FileReader(inputFile);// reader wraps/use inputstream
            writer = new FileWriter(outFile);//writer wraps/use outputstream
            int readCharacter;// will contain the character which we will read
            while ((readCharacter = reader.read()) > 0) {
                writer.write(readCharacter);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close(reader);
            close(writer);
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
