package Interview_Practice_Question.String_Questions;

import java.util.Scanner;

public class RemoveDuplicateCharacterNestedLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = scan.nextLine();
        String result = "";

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(result.indexOf(ch) == -1){
                result += ch;

            }
        }
        System.out.println("String After Removing Duplicates : '"+result+"'");

    }
}
