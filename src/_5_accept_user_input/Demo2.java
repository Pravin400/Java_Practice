package _5_accept_user_input;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the 2 Numbers : ");
        int num1 = Input.nextInt();
        int num2 = Input.nextInt();
        System.out.println("The Addition of 2 Number is : "+(num1 +num2));

    }
}
