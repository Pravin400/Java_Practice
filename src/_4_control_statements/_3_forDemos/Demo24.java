package _4_control_statements._3_forDemos;

import java.util.Scanner;

public class Demo24 {
//the perfect number means the sum of factors is equal to the given number
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter The Number To Check Perfect or Not : ");
    int Number = sc.nextInt();
    int sum = 0;
    for (int i = 1 ;i<=Number/2;i++){
        if(Number%i == 0){
            sum += i;
            System.out.println(i);
        }

    }
        if(sum == Number){
            System.out.println("The Given Number "+Number+" is Perfect Number");
        }
        else {
            System.out.println("The Given Number is Non a Perfect Number ");
        }
}
}
