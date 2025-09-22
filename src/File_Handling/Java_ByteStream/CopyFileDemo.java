package File_Handling.Java_ByteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Demonstrates copying a binary file using byte streams.
 * Reads from a source file and writes to a target file.
 */
public class CopyFileDemo {
    public static void main(String[] args) {
        // Name of source file to copy (must exist in the same directory)
        String source = "fileHandling.jpg";
        // Name of the new file to create as a copy
        String target = "copyImage.jpg";

        // try-with-resources automatically closes streams even if an exception occurs
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(target)) {

            byte[] buffer = new byte[1024]; // 1 KB buffer for efficient copying
            int bytesRead;

            // Read bytes into buffer and write them to target file until EOF (-1)
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println("File copied successfully");

        } catch (IOException e) {
            // Prints stack trace if file not found or any I/O error occurs
            e.printStackTrace();
        }
    }
}
