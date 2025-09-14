package HackerRank_Questions;

import java.util.*;

public class hackerSolutionWord_count {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
// to remove the empty white spaces from start and end
        s = s.trim();
        // Check if the string is empty after trimming
        if (s.isEmpty()) {
            System.out.println(0);
            return; // Exit early
        }
        // Write your code here.
// for only white space removing use this
//        String[] words = s.split("\\s+");

//Split using regex: non-alphanumeric characters as delimiters

        String[] words = s.split("[^a-zA-Z0-9]+");

        System.out.println(words.length);
        for(int i = 0;i < words.length;i++){
                System.out.println(words[i]);
        }

    }
}

