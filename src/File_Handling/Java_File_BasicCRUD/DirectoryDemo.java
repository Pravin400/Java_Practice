package File_Handling.Java_File_BasicCRUD;

import java.io.File;

public class DirectoryDemo {
    public static void main(String[] args) {
        File dir = new File("Books");
        if(!dir.exists()){
            dir.mkdir();//create the single directory
            System.out.println("Directory '"+dir.getName()+"' Created Successfully");
        }else {
            System.out.println("Directory already exists at : "+dir.getAbsolutePath());
        }

        try {
            new File(dir,"Java.txt").createNewFile();
            new File(dir,"Python.txt").createNewFile();
        }catch (Exception e){
            e.printStackTrace();
        }

        //List Files
        String [] files = dir.list();
        System.out.println("Directory '"+dir.getName()+"' Listed Successfully");
        System.out.println("Files in "+dir.getName()+" : ");
        for(String file : files){
            System.out.println(" - "+file);
        }
    }
}
