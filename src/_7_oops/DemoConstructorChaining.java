package _7_oops;

class A {
    A() {
        System.out.println("A's constructor");
    }
    public void add(int a ,int b){
        System.out.println("Addition is : "+(a+b));
    }
}

class B extends A {
    {
        System.out.println("Instance block of B");
    }
/*Inside the no-arg constructor, this(10) calls the parameterized constructor of class B.   
Before executing the body of B(int x), Java checks if there's a call to super()
(constructor of superclass A). If not, Java implicitly inserts super().*/
    B() {
        this(10);

        System.out.println("B's no-arg constructor");
    }

    B(int x) {
//      call to super must be first of the constructor body
        super.add(10,20);
        System.out.println("B's parameterized constructor");
    }

    static {
        System.out.println("Static block of B");
    }
}

public class DemoConstructorChaining {
    public static void main(String[] args) {
        B b = new B();
    }
}

