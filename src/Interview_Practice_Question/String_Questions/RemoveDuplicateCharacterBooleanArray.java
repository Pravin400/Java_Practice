package Interview_Practice_Question.String_Questions;

import java.util.Scanner;

public class RemoveDuplicateCharacterBooleanArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = scan.nextLine();

        boolean [] seen = new boolean[256];

        StringBuilder result = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(!seen[ch]){
                seen[ch] = true;
                result.append(ch);
            }
        }
        System.out.println("String After REmoving Duplicates : '"+result+"'");

    }
}
