package _6_class_component._3_Constructor;

class Parent {
    Parent() {  // Default constructor
        System.out.println("Parent Constructor Called");
    }
}

class Child extends Parent {
    Child() {
        // Internally, Java inserts super(); here
        System.out.println("Child Constructor Called");
    }
}

public class Demo3ConstructorChaining {
    public static void main(String[] args) {
        Child obj = new Child();  // Creating a child object
    }
}

