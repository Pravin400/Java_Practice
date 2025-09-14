package _4_control_statements._4_whileDemos;

public class Demo5ReverseNumber {
    public static void main(String[] args) {
        int number = 123456;
        System.out.println("The Acutal Number is : "+number);
        int digit = 0;
        while (number>0){
            int rem = number % 10;
            digit = digit * 10 + rem;
            number = number /10;
        }
        System.out.println("The Reverse Number is : "+digit);

    }
}
