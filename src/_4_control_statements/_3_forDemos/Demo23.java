package _4_control_statements._3_forDemos;

import java.util.Scanner;

public class Demo23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int number = sc.nextInt();
        System.out.print("you Entered number is : "+number);
        System.out.println("The Factorial of The Number "+number+" is : ");
        for(int i = 1; i<=number/2;i++){
            if(number%i==0){
                System.out.print("\t"+i);
            }
        }

    }
}
