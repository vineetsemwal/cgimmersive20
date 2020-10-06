package ioex;

import java.io.*;

public class FileCopyWithTryResource {

    public static void main(String args[]) {
        FileCopyWithTryResource example = new FileCopyWithTryResource();
        File input = new File("/home/vineet/Documents/experiments/input.txt");
        File output = new File("/home/vineet/Documents/experiments/output.txt");
        example.copy(input, output);

    }

    void copy(File input, File output) {
        try(   InputStream fin = new FileInputStream(input);
                OutputStream fos = new FileOutputStream(output);

                ) {
            int count=0;
            int readByte;// will contain the byte which we will read
            while ((readByte = fin.read()) > 0) {
                fos.write(readByte);
                count++;
            }
            fos.flush();
            System.out.println("no of bytes written="+count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
