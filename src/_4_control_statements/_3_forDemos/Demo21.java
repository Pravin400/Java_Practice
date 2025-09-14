package _4_control_statements._3_forDemos;

public class Demo21 {
    public static void main(String[] args) {

    int number1 = 100;
    int number2 = 20;
    int quotient = 0;
    for (;number1>=number2;quotient++){
        number1 = number1-number2;
    }
        System.out.println("the remainder is : "+number1);
        System.out.println("the quotient is : "+quotient);
    }
}
