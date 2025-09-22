package File_Handling.Java_ByteStream;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadBinaryFile {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("java.txt")) {
            int ch;
            while ((ch = fis.read()) != -1){
                System.out.print((char)ch);//byte to char convert
            }
            System.out.println();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
