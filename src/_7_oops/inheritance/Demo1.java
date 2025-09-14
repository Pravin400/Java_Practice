package _7_oops.inheritance;
public class Demo1 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println("This is number from class A : "+b.x);
        System.out.println("This is number from class b : "+b.y);
        A abx = new B();
        A abp = new A();

    }
}
//When you create an object of a child class (subclass) in Java:

//🔁 Both the child class constructor and the parent class constructor are called — in that order:
class A {
    int x = 10;
    A(){

        System.out.println("A class Constructor");

    }
}

class B extends  A{
    int y = 50;
    B(){

        System.out.println("B class Constructor");

    }
}
