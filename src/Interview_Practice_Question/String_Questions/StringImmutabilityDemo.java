package Interview_Practice_Question.String_Questions;

import java.util.Scanner;

public class StringImmutabilityDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        str = str.concat("Monubahu");
        str = "mahesh dalle";
        System.out.println(str);
//String is immutable but the reference of the string are mutable
//means previous string still as it is im memory just pointing to new reference
    }

}
