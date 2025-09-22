package File_Handling.Java_ByteStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Writes a string as bytes to a file using FileOutputStream.
 */
public class WriteBinaryFile {
    public static void main(String[] args) {
        String data = "Hello World!"; // Data to write

        // try-with-resources closes FileOutputStream automatically
        try (FileOutputStream fos = new FileOutputStream("java.txt")) {
            // Convert string to bytes and write to file
            fos.write(data.getBytes());
            System.out.println("Data Written Successfully");

        } catch (IOException e) {
            // Handles exceptions such as inability to create/write file
            e.printStackTrace();
        }
    }
}
