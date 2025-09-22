package File_Handling.Java_ByteStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Reads a binary/text file byte by byte
 * and prints the contents as characters on the console.
 */
public class ReadBinaryFile {
    public static void main(String[] args) {
        // try-with-resources ensures the stream closes automatically
        try (FileInputStream fis = new FileInputStream("java.txt")) {
            int ch;

            // Read one byte at a time; returns -1 when end of file is reached
            while ((ch = fis.read()) != -1) {
                // Convert byte value to a character and print
                System.out.print((char) ch); // byte → char conversion
            }
            System.out.println(); // Print a newline at the end

        } catch (IOException e) {
            // Handles cases like file not found or read error
            e.printStackTrace();
        }
    }
}
