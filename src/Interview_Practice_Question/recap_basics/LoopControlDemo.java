package Interview_Practice_Question.recap_basics;

import java.util.Scanner;

public class LoopControlDemo {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("The Number from 1 to 50");
        for (int i = 1; i <= 50; i++) {
            System.out.print(i+", ");
        }
        System.out.println("\nThe Number from 1 to 50 Where skips multiple of 5");
        for (int i = 1; i <= 50; i++) {
            if(i%5 == 0){
                continue;
            }
            System.out.print(i+", ");
        }
        System.out.println("\nThe Number from 1 to 50 Stop when number reaches 37");
        for (int i = 1; i <= 50; i++) {
            System.out.print(i+", ");
            if(i == 37){
                break;
            }


        }

    }
}
