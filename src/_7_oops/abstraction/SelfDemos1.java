package _7_oops.abstraction;

abstract class Animal {
    abstract void makeSound(); // Different for Dog, Cat, etc.

    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark bark!");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow meow!");
    }
}
public class SelfDemos1{
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        System.out.println("Child Dog class method");
        dog.makeSound();
        System.out.println("Child Cat class method");
        cat.makeSound();
        System.out.println("Parent Animal class method");
        dog.sleep();
    }
}

