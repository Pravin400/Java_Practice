package __Object_Class;

import _6_class_component._1_variables.Student;

public class Demo1 {
    String name;
    Demo1(String name){
        this.name = name;
    }
// not need to override the because it is in same class
//    @Override
//    public Object clone() throws CloneNotSupportedException{
//        return super.clone();
//    }
    public static void main(String[] args) throws CloneNotSupportedException{
        Demo1 s1 = new Demo1("John");
        Demo1 s2 = (Demo1) s1.clone();
        System.out.println("original: "+s1.name);
        System.out.println("Clone: "+s2.name);

    }
}
