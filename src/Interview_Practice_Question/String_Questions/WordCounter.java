package Interview_Practice_Question.String_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        System.out.println("Word Counter");
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Sentence : ");
        String str = scan.nextLine();

//        String [] words = str.split(" "); this can only skips only one space if sentence consists of more than one space still skips one space
        String [] words = str.split("[\\s+]");
        System.out.println("length of string are : "+str.length());
        System.out.println("Original sentence is : '"+str+"'");
        System.out.println("World Count in sentence is : "+words.length);
    }
}
