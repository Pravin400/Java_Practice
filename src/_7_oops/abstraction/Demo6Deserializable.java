package _7_oops.abstraction;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Demo6Deserializable {

    public static void main(String[] args) throws Exception {
        // Read object from file
        FileInputStream fileIn = new FileInputStream("student.txt");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        Student s2 = (Student) in.readObject();
        in.close();
        fileIn.close();

        System.out.println("ID: " + s2.id + ", Name: " + s2.name);
    }
}
