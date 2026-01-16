package Interview_Practice_Question.String_Questions.Mid_to_High_String;

import java.util.Scanner;

public class ToggleCaseConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z') {
                result = result + (char)(ch+32);
            }
        }
    }
}
