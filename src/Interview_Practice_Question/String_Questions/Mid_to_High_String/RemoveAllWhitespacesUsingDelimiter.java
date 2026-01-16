package Interview_Practice_Question.String_Questions.Mid_to_High_String;

import java.util.Scanner;

public class RemoveAllWhitespacesUsingDelimiter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        String [] word = str.split("[\\s+]");
        String str1 = String.join("", word);

        System.out.println("The string after removing the whitespace is " + str1);
    }
}
