package _7_oops.abstraction;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Demo5Serializable {

    public static void main(String[] args) throws Exception {
        Student s1 = new Student(1, "Pravin");

        // Write object to file
        FileOutputStream fileOut = new FileOutputStream("student.txt");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(s1);
        out.close();
        fileOut.close();

        System.out.println("Object saved to file.");
    }

}

class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

