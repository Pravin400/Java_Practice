package Interview_Practice_Question.String_Questions.Mid_to_High_String;

import java.util.Scanner;

public class RemoveAllWhitespacesLoopsConditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        String newstr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {

             newstr = str.replace(" ", "");
            }
        }

        System.out.println("The string after removing the whitespace is " + newstr);
    }
}
