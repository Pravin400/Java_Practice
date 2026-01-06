package Interview_Practice_Question.String_Questions;

import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        char [] charString = str.toCharArray();
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = charString[i];
            if(ch >= 'a' && ch <= 'z' ){
                if(charString[i] == 'a' || charString[i] == 'e'|| charString[i] == 'i'|| charString[i] == 'o'|| charString[i] == 'u'){
                    vowels++;
                }else {
                    consonants++;
                }
            }

        }
//        consonants = str.length() - vowels;
        System.out.println("The String Consists of '"+vowels+"' vowels and '"+consonants+"' consonants.");
    }
}
