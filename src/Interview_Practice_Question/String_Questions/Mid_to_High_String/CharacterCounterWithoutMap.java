package Interview_Practice_Question.String_Questions.Mid_to_High_String;

import java.util.Scanner;

public class CharacterCounterWithoutMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = input.nextLine();

        int alphabets = 0;
        int digits = 0;
        int specialChars = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                continue;
            }
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                alphabets++;
            } else if ((ch >= '0' && ch <= '9')) {
                digits++;
            } else {
                specialChars++;
            }
        }
        System.out.println("Alphabets : " + alphabets);
        System.out.println("Digits : " + digits);
        System.out.println("SpecialChars : " + specialChars);
    }
}