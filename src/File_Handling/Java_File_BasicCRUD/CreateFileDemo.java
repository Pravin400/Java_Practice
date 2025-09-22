package File_Handling.Java_File_BasicCRUD;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo {
    public static void main(String[] args) {
        try {
            File file = new File("sample.txt");//relative path
            if(file.createNewFile()){
                System.out.println("File created "+file.getName()+" successfully At Location : "+file.getAbsolutePath());
            }else {
                System.out.println("File already exists at : "+file.getAbsolutePath());
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}


