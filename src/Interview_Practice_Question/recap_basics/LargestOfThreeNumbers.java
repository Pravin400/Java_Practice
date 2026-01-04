package Interview_Practice_Question.recap_basics;

import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number1: ");
        int number1 = input.nextInt();
        System.out.print("Enter a number2: ");
        int number2 = input.nextInt();
        System.out.print("Enter a number3: ");
        int number3 = input.nextInt();
        System.out.println("Now Finding the Laargest Number Out Of them . . . . ");
        if(number1 == number2 && number2 == number3){
            System.out.println("The largest number is : "+number1);
        }
        else {
            if(number1 > number2 & number2 > number3){
                    System.out.println("The Largest Number is "+number1);

            }
            else if(number2 > number1 && number2 > number3){
                    System.out.println("The Largest Number is "+number2);
            }
            else {
                System.out.println("The Largest Number is "+number3);
            }
        input.close();
        }

    }
}
