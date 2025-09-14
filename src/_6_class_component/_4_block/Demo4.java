package _6_class_component._4_block;

public class Demo4 {
    {
        System.out.println("instance block");
    }
    static {
        System.out.println("static block");
    }
    Demo4(){
        //1.super class constructor or maybe same class constructor
        //2. same class instance block
        super();
        System.out.println("zero param constructor");
    }
    public static void main(String[] args) {
        Demo4 demo4 = new Demo4();
    }
}
/*
//Super Class
//📝 Example 1:Calling Default Parent Constructor
class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }
}

class Dog extends Animal {
    Dog() {
        super();  // Calls Animal() constructor
        System.out.println("Dog constructor called");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}

//📝 Example 2: Calling Parameterized Parent Constructor
class Animal {
    Animal(String type) {
        System.out.println("Animal type: " + type);
    }
}

class Dog extends Animal {
    Dog(String breed) {
        super("Mammal"); // Calls Animal's constructor with an argument
        System.out.println("Dog breed: " + breed);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog("Labrador");
    }
}

*/

