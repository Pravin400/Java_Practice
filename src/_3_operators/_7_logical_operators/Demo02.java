package _3_operators._7_logical_operators;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*** To Check  Year Leap Or Not ***");
        int a ;
        while (true){
            System.out.print("Enter A Year : ");
            a = input.nextInt();
            if(a >= 1000 && a <= 9999){
                break;
            }
            else {
                System.out.println("!!!!Enter A Valid Input!!!!");
            }
        }
            if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) {
                System.out.println("You Entered Year " + a + " Is A Leap Year");
            } else {
                System.out.println("You Entered Year " + a + " Is Not a Leap Year");
            }


    }
}
