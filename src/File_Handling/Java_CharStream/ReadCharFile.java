package File_Handling.Java_CharStream;

import java.io.FileReader;
import java.io.IOException;

/**
 * Reads a text file character by character.
 */
public class ReadCharFile {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("charExample.txt")) {
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
