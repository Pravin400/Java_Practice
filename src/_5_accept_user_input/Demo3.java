package _5_accept_user_input;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
//All User Input Types
        Scanner sc = new Scanner(System.in);
        //For Byte
        System.out.println("Enter a Byte Value : ");
        byte Byte = sc.nextByte();
        //For Short
        System.out.println("Enter short value : ");
        short Short = sc.nextShort();

        System.out.println("Enter int value : ");
        int Int = sc.nextInt();

        System.out.println("Enter long value : ");
        long Long = sc.nextLong();

        System.out.println("Enter float value : ");
        float Float = sc.nextFloat();

        System.out.println("Enter double value : ");
        double Double = sc.nextDouble();

        System.out.println("Enter boolean value : ");
        boolean Boolean = sc.nextBoolean();

        System.out.println("Enter String value : ");
        String SingleString = sc.next();

        System.out.println("Enter char value : ");
        char Char = sc.next().charAt(1);

        System.out.println("************* printing *******************");
        System.out.println(Byte);
        System.out.println(Short);
        System.out.println(Int);
        System.out.println(Long);
        System.out.println(Float);
        System.out.println(Double);
        System.out.println(Boolean);
        System.out.println(SingleString);
        System.out.println(Char);
    }

    }

