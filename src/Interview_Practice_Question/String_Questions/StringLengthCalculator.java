package Interview_Practice_Question.String_Questions;

import java.util.Scanner;

public class StringLengthCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        int length = str.length();
        System.out.println("length of the string is: " + length);
        String str1 = new String();
        System.out.println("here is the empty string "+str1);
        System.out.println("Length of empty string is: " + str1.length());
    }
}
