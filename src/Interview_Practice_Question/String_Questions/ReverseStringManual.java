package Interview_Practice_Question.String_Questions;

import java.util.Scanner;

public class ReverseStringManual {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        int length = str.length();
        int start = 0;
        int end = length - 1;
        char[] charArray = str.toCharArray();//convert string to character array
        for (int i = 0; i <= end/2; i++) {
            char temp = charArray[i];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        String reverseString = new String(charArray);
        System.out.println("Original string is: " + str);
        System.out.println("Reverse string is: " + reverseString);
    }}
