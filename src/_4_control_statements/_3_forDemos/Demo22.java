package _4_control_statements._3_forDemos;

public class Demo22 {
    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 20;
        int quotient = 0;
        while(number1>=number2){
            number1 = number1-number2;
            quotient++;
        }
        System.out.println("the Quotient is : "+quotient);
        System.out.println("the remainder is : "+number1);
    }
}
