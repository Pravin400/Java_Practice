package Interview_Practice_Question.String_Questions.Mid_to_High_String;

import java.util.Arrays;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scan.nextLine();
        int [] freq = new int[256];
        for(int i = 0; i < str.length(); i++){
            freq[str.charAt(i)]++;
        }
        for(int i = 0; i < str.length(); i++){
            if(freq[str.charAt(i)]==1){
                System.out.println("First Non Repeating character are : "+str.charAt(i));
                return;
            }
        }
        System.out.println("There will be no one first non-repeating character foound");
     }
}
