package ioex;

import java.io.*;

public class FileCopyUsingCharStreamLinewise {

    public static void main(String args[]) {
        FileCopyUsingCharStreamLinewise example = new FileCopyUsingCharStreamLinewise();
        File input = new File("/home/vineet/Documents/experiments/input.txt");
        File output = new File("/home/vineet/Documents/experiments/output.txt");
        example.readWrite(input, output);
    }

    void readWrite(File inputFile, File outFile) {
        InputStream inputStream = null;
        InputStreamReader reader = null;
        OutputStream outputStream = null;
        OutputStreamWriter writer = null;
        BufferedReader bufferedReader=null;
        BufferedWriter bufferedWriter=null;
        try {
            inputStream = new FileInputStream(inputFile);
            outputStream = new FileOutputStream(outFile);
            reader = new InputStreamReader(inputStream);// reader wraps/use inputstream
            bufferedReader=new BufferedReader(reader);
            writer = new OutputStreamWriter(outputStream);//writer wraps/use outputstream
            bufferedWriter=new BufferedWriter(writer);
            int linesCount=0;// will contain the character which we will read
            String readLine;
            while ((readLine=bufferedReader.readLine())!=null) {
                bufferedWriter.write(readLine);
                linesCount++;
                System.out.println("line found="+readLine);
            }
            bufferedWriter.flush();
            System.out.println("lines count="+linesCount);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close(reader);
            close(inputStream);
            close(writer);
            close(outputStream);
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
