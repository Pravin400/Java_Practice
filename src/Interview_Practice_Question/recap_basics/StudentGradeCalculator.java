package Interview_Practice_Question.recap_basics;

import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Percentage Calculator");
        System.out.println("Dear Student Enter a Marks out of 100 for below Subject : ");
        System.out.print("Maths : ");
        int marks1= sc.nextInt();
        System.out.print("Science : ");
        int marks2= sc.nextInt();
        System.out.print("Biology : ");
        int marks3= sc.nextInt();
        System.out.print("Geography : ");
        int marks4= sc.nextInt();
        System.out.print("History : ");
        int marks5= sc.nextInt();
        System.out.print("Calculating Sum Of Makrs"+" . ");
        Thread.sleep(1000);
        System.out.print(" . ");
        Thread.sleep(1000);
        System.out.print(" . ");
        Thread.sleep(1000);
        System.out.println(" . ");
        int Markssum = marks1+marks2+marks3+marks4+marks5;
        System.out.println("Marks sum is : "+Markssum+" out of 500");
        int Percentage = (Markssum/500)*100;
        System.out.println("Percentage is : "+Percentage+" %");
        if(Percentage>=75){
            System.out.println("The Grade is Distinction");
        }
        else if(Percentage >= 60){
            System.out.println("The Grade is 1st Class");
        }
        else if(Percentage >= 50){
            System.out.println("The Grade is 2nd Class");
        }
        else {
            System.out.println("The Grade is Fail");
        }
        sc.close();
    }
}

