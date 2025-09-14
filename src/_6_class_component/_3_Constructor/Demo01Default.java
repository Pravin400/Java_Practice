package _6_class_component._3_Constructor;

class Person {
    int age;
    String name;

    // No constructor defined, so Java provides a default constructor
    void show() {
        System.out.println("Age: " + age);  // Default value: 0
        System.out.println("Name: " + name); // Default value: null
    }
}

public class Demo01Default {
    public static void main(String[] args) {
        Person p = new Person();  // Java automatically calls the default constructor
        p.show();
    }
}

