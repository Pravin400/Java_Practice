package Interview_Practice_Question.String_Questions;

import java.util.Scanner;

public class StringInputFix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        System.out.println("Enter the string");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.println(name);


    }

}
