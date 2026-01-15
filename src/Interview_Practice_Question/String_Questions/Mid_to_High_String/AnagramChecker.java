package Interview_Practice_Question.String_Questions.Mid_to_High_String;

import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Anagram Checker!");
        System.out.print("Enter First Word : ");
        String str1 = sc.nextLine().toLowerCase();
        System.out.print("Enter Second Word : ");
        String str2 = sc.nextLine().toLowerCase();
       if(str1.length() != str2.length()){
           System.out.println("Not Anagram");
           return;
       }
       int [] freq = new int[256];

       for(int i=0;i<str1.length();i++){
           freq[str1.charAt(i)]++;
           freq[str2.charAt(i)]--;
       }
       for(int count : freq){
           if(count!=0){
               System.out.println("Not Anagram");
               return;
           }
       }
        System.out.println(str1 + " & " + str2+ " is Anagram");
        System.out.println("The Anagram Checker is Done!");
    }
}
