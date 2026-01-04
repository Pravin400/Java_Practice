package Interview_Practice_Question.recap_basics;

import java.util.Scanner;

public class DivisibilityChecker {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = sc.nextInt();
        System.out.println("Divisiblity Checker : ");
        if(a % 3 == 0 && a % 5 == 0){
            System.out.println("Divisible By both 3 and 5");
        }
        else if(a % 3 == 0){
            System.out.println("Divisible By 3");
        }
        else if(a % 5 == 0){
            System.out.println("Divisible By 5");
        }
        else{
            System.out.println("Divisible By none");
        }
    sc.close();
    }
}
