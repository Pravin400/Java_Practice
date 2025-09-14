package _4_control_statements._3_forDemos;

public class Demo20 {
    public static void main(String[] args) {
        System.out.println("multiplication of numbers using + operator");
        int number1 = 5;
        int number2 = 4;
        int multiplication = 0;
        for(int i = 1 ;i<=number2;i++){
            multiplication = multiplication+number1;
        }
        System.out.println("Multiplication is "+multiplication);
    }
}
