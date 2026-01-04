package Interview_Practice_Question.recap_basics;

import java.util.Scanner;

public class PrimitiveTypeCastingDemo {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Integer number : ");
        int a = sc.nextInt();
        System.out.println("Type Casting integer to double In Process . . . ");
        double b = a;
        Thread.sleep(2000);
        System.out.println("Convertion of Int to Double is : "+b);
        System.out.println("Type Casting double to integer In Process . . . ");
        int c = (int) b;
        Thread.sleep(2000);
        System.out.println("Convertion of Double to Int is : "+c);

    sc.close();
    }
}
