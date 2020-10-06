package ioex;

import java.io.*;

public class BetterFileCopyWithTryResource {

    public static void main(String args[]) {
        BetterFileCopyWithTryResource example = new BetterFileCopyWithTryResource();
        File input = new File("/home/vineet/Documents/experiments/input.txt");
        File output = new File("/home/vineet/Documents/experiments/output.txt");
        example.copy(input, output);

    }

    void copy(File input, File output) {
        try (
                InputStream fin = new FileInputStream(input);
                BufferedInputStream bin = new BufferedInputStream(fin);
                OutputStream fos = new FileOutputStream(output);
                BufferedOutputStream bout = new BufferedOutputStream(fos);
        ) {
            int readBytesCount;//contains count of the bytes read
            int totalBytescount = 0;
            byte data[] = new byte[1000];
            while ((readBytesCount = bin.read(data)) > 0) {
                bout.write(data, 0, readBytesCount);
                totalBytescount = totalBytescount + readBytesCount;
            }

            System.out.println("no of bytes written=" + totalBytescount);
            bout.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void close(InputStream stream) {
        try {
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void close(OutputStream stream) {
        try {
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
