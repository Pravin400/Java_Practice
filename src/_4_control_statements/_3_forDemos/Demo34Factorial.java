package _4_control_statements._3_forDemos;

public class Demo34Factorial {
    public static void main(String[] args) {
        int number = 6;
        int factorial = 1;
        for(int i = 1;i<=number;i++){
            factorial *= i;
        }
        System.out.println("The Factorial Of "+number+" is "+factorial);
    }
}
