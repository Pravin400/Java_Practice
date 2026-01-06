package Interview_Practice_Question.String_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateCharacterFinder {
    public static void main(String[] args) {
        System.out.println("Finding Duplicate Characters");
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = scan.nextLine();
        str.toLowerCase();

        char[] charString = str.toCharArray();
        Arrays.sort(charString);

        boolean found = false;

        System.out.println("Duplicate Characters are: ");
        for (int i = 0; i < charString.length-1; i++) {
            if (charString[i]==' ') continue;

            if(charString[i] == charString[i+1]){
                found = true;
                System.out.println(charString[i]);
                while (i < charString.length-1 && charString[i] == charString[i+1]) i++;
            }
        };
            if (!found) System.out.println("No Duplicates");

    }
}
