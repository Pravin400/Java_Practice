package Interview_Practice_Question.String_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class CharacterFrequencyCounter {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        char [] charString = str.toCharArray();
        Arrays.sort(charString);

        for (int i = 0; i < charString.length; i++){

            if (charString[i]==' '){
                continue;
            }
            int count = 1;
            while (i < charString.length - 1 && charString[i]==charString[i+1]){
                count++;
                i++;
            }
            System.out.println(charString[i] + " : "+count);
        }

    }
}
