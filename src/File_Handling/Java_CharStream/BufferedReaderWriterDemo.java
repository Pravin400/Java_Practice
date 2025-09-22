package File_Handling.Java_CharStream;

import java.io.*;

/**
 * Demonstrates buffered character I/O
 * for faster reading and writing.
 */
public class BufferedReaderWriterDemo {
    public static void main(String[] args) {
        String fileName = "bufferedDemo.txt";

        // Write multiple lines with buffering
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write("Line 1: Buffered I/O example");
            bw.newLine();
            bw.write("Line 2: Faster reading/writing");
            System.out.println("Buffered write complete.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read lines back efficiently
        System.out.println("Reading lines from file:");
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
