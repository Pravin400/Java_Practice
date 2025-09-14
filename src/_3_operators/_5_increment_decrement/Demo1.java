package _3_operators._5_increment_decrement;

public class Demo1 {
    public static void main(String[] args) {


        System.out.println("Pre-Increment Operator");
        int a  = 10;
        System.out.println("Before Increment : "+a);
        int b  = ++a;
        System.out.println("After Increment : "+b);

        System.out.println("Pre-Decrement Operator");
        int c  = 10;
        System.out.println("Before Decrement : "+c);
        int d  = --c;
        System.out.println("After Increment : "+d);

        System.out.println("Post-Increment Operator");
        int e  = 10;
        System.out.println("Before Increment : "+e);
        int f  = ++e;
        System.out.println("After Increment : "+f);

        System.out.println("Pre-Decrement Operator");
        int g  = 10;
        System.out.println("Before Decrement : "+g);
        int h  = --g;
        System.out.println("After Increment : "+h);

    }
}
