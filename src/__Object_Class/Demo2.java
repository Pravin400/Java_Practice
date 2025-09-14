package __Object_Class;

import _6_class_component._1_variables.Student;
//this implement cloneable tell's i allow this class to be cloned
class student implements Cloneable{
    String name;
    student(String name) {
        this.name = name;
    }
// Shallow Copy
//    @Override
    public Object clone() throws CloneNotSupportedException{
        //super is use to access the parent class methods
        return super.clone();
        }
    }

public class Demo2 {

// need to override because java is by default protected so it can be accesed in same class , subclass , & in samePakage
// not need to override the because it is in same class
    public static void main(String[] args) throws CloneNotSupportedException{
        student s1 = new student("xyz");
        student s2 = (student) s1.clone();
        System.out.println("original: "+s1.name);
        System.out.println("Clone: "+s2.name);

    }
}
