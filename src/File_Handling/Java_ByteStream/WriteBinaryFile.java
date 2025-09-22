package File_Handling.Java_ByteStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBinaryFile {
    public static void main(String[] args) {
        String data = "Hello World!";
        try (FileOutputStream fos = new FileOutputStream("java.txt")) {
            fos.write(data.getBytes());
            System.out.println("Data Written Successfully");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
