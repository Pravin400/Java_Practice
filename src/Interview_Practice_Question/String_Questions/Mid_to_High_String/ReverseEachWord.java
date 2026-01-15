package Interview_Practice_Question.String_Questions.Mid_to_High_String;

import java.util.Scanner;

public class ReverseEachWord {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        String[] words = str.split("\\s+");

        for (int i = 0; i < words.length; i++) {

            char[] charArray = words[i].toCharArray();
            int start = 0;
            int end = charArray.length - 1;

            while (start < end) {
                char temp = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = temp;
                start++;
                end--;
            }

            words[i] = new String(charArray);
        }

        System.out.println(String.join(" ", words));
    }
}
