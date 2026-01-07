package Interview_Practice_Question.String_Questions;

import java.util.Scanner;

public class LongestWordFinder {
    public static void main(String[] args) {
        System.out.println("Longest Word Finder");
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Sentence : ");
        String str = scan.nextLine();

        String [] words = str.split("[\\s+]");
        int max_length = 0;
        int max_index = -1;
        for(int i=0;i<words.length;i++){
            String word = words[i];
            if(max_length < word.length()){
                max_length = word.length();
                max_index = i;
            }
        }
        System.out.println("Maximum Length : "+max_length);
        System.out.println("Longest Word : "+words[max_index]);
    }
}
