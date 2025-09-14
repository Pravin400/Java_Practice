package _4_control_statements._4_whileDemos;

public class Demo2SumOfDigits {
    public static void main(String[] args) {
        int number = 123456;
        int sum = 0;
        while (number > 0){
            int digit = number % 10;
            sum = sum + digit;
            number = number /10;
        }
        System.out.println("Sum of Dight is : "+ sum);
    }
}
