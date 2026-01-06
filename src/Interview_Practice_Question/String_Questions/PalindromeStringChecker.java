package Interview_Practice_Question.String_Questions;

import java.util.Scanner;

public class PalindromeStringChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        char [] charString = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;
        boolean flag = true;
        for (int i = 0; i <= end/2; i++) {
            if ( charString[start] == charString[end] && flag) {
                flag = true;
                start++;
                end--;
            }else {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("The string '"+str+"' is palindrome");
        }else {
            System.out.println("The string '"+str+"' is not palindrome");
        }


    }
}
