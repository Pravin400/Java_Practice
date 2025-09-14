package _6_class_component._2_methods;

public class Demo2 {
    public static void main(String[] args) {
//Static method can be call directly,by reference variable,by class name
        Demo2 Self = new Demo2() ;
//We can able to call static method using reference variable
//        System.out.println("Addition is : "+Self.add(100,200));
//        System.out.println("Addition is : "+add(100,200));
        System.out.println("Addition is : "+Demo2.add(100,200));
    }

    public static int add(int i, int i1) {
        return i + i1;
    }

    //method definition

}
