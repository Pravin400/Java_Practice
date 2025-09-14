package _6_class_component._5_nestedClases;

public class Demo1 {
    //1. static nested classes
    static class A {
        String name = "This is Static Nested Class";
        //
    }

    //2. non-static nested class - inner class
    class B {
        static int d = 200;
        String name = "This is Non-Static Nested Class";

    }

    public static void main(String[] args) {
        //3. local inner class
        class C {
            int a;
            String name = "This is Local Inner Class";

        }
        Demo1 demo = new Demo1();
        A a = new A();
        System.out.println(a.name);
//to call the not-static methos use this way
        B b = demo.new B();
        System.out.println(b.name);
        System.out.println(b.d);
        C c = new C();
        System.out.println(c.name);
        System.out.println(c.a);
    }

}
