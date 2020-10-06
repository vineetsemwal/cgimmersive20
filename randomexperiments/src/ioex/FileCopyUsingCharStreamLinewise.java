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
        InputStreamReader reader = null;
        OutputStreamWriter writer = null;
        BufferedReader bufferedReader=null;
        BufferedWriter bufferedWriter=null;
        try {
            reader = new FileReader(inputFile);// reader wraps/use inputstream
            bufferedReader=new BufferedReader(reader);
            writer = new FileWriter(outFile);//writer wraps/use outputstream
            bufferedWriter=new BufferedWriter(writer);
            int linesCount=0;// will contain the character which we will read
            String readLine;
            while ((readLine=bufferedReader.readLine())!=null) {
                bufferedWriter.write(readLine);
                bufferedWriter.newLine();//writes line separator (end of line character)
                linesCount++;
                System.out.println("line found="+readLine);
            }
            bufferedWriter.flush();
            System.out.println("lines count="+linesCount);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close(bufferedReader);
            close(reader);
            close(bufferedWriter);
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
