package _7_oops.abstraction;

public class Demo3 {
    public static void main(String[] args) {
        interface I1 {
            //components allowed

            // by default variables are public static final
            int variable1 = 100;
            public static final int variable2 = 200;

            // instance methods are not allowed
            //void m1(){}

            //by default methods are public abstract
            void m1();

            //static methods are allowed from java8
            static void m2() {
                System.out.println("static method from java 8");

            }

            //new feature from java 8
            default void m3() {
                System.out.println("default method from java 8");
            }


            //constructors are not allowed
            //I1(){}


            //instance blocks are not allowed
            //{}

            //static blocks are not allowed
            //static {}

            //by default nested class are public static
            public static class NestedClass {
            }

        }
        I1 ref = new I1() {
            @Override
            public void m1() {
                System.out.println("Hello");
            }

        };
        ref.m1();
        I1.m2();//static method cannot call using refrence
        ref.m3();

        // Print interface variables
        System.out.println("Variable1: " + I1.variable1); // 100
        System.out.println("Variable2: " + I1.variable2); // 200

    }
}