package File_Handling.Java_File_BasicCRUD;

import java.io.File;

public class DeleteFileDemo {
    public static void main(String[] args) {
        File file = new File("sample.txt");
        if(file.exists()) {
            file.delete();
            System.out.println("File '"+file.getName()+"' Deleted Successfully");
        }else{
            System.out.println("File Does Not Exist Becasue of Unable to delete ");
        }
    }
}
