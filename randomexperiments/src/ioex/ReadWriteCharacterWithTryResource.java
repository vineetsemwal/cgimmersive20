package ioex;

import java.io.*;

public class ReadWriteCharacterWithTryResource {

    public static void main(String args[]) {
        ReadWriteCharacterWithTryResource example = new ReadWriteCharacterWithTryResource();
        example.readWrite();
    }

    void readWrite() {
        try {
            InputStream inputStream = System.in;//default inputstream
            OutputStream outputStream = System.out;//defualt outputstream
            InputStreamReader reader = new InputStreamReader(inputStream);// reader wraps/use inputstream
            OutputStreamWriter writer = new OutputStreamWriter(outputStream);//writer wraps/use outputstream
            int readCharacter;// will contain the character which we will read
            System.out.println("Enter Data");
            while ((readCharacter = reader.read()) != 'z') {
                writer.write(readCharacter);
            }
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
