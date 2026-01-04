package Interview_Practice_Question.recap_basics;

import java.util.Scanner;

public class AgeEligibilityValidator {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Age : ");
        int a = sc.nextInt();
        if (a < 0) {
            System.out.println("Invalid");
        } else if (a >= 18) {
            System.out.println("Eligible");
        }else {
            System.out.println("Not eligible");
        }
        sc.close();
    }
}
