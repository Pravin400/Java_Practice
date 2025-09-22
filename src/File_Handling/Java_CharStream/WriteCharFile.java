package File_Handling.Java_CharStream;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Writes text to a file using character stream.
 */

public class WriteCharFile {
    public static void main(String[] args) {

    String text = "Java Character Stream Example\nSecond Line";

    // try-with-resources auto-closes FileWriter
    try(FileWriter writer = new FileWriter("charExample.txt")){
        writer.write(text);
        System.out.println("Successfully text written to charExample.txt");
    }
    catch(IOException e){
        e.printStackTrace();
    }

    }
}
