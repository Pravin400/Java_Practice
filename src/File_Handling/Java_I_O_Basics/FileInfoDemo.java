package File_Handling.Java_I_O_Basics;

import java.io.File;

public class FileInfoDemo {
    public static void main(String[] args) {
        File file = new File("sample.txt");
        if(file.exists()){
            System.out.println("File Already Exists ");
            System.out.println("Name : "+file.getName());
            System.out.println("Path : "+file.getAbsolutePath());
            System.out.println("Size : "+file.length()+" Bytes");
            System.out.println("Writable : "+file.canWrite());
            System.out.println("Readable : "+file.canRead());
        }
        else {
            System.out.println("File Does Not Exist");
        }
    }
}
