package _3_operators._7_logical_operators;

public class Demo03 {
    public static void main(String[] args) {
        System.out.println(10 % 2 == 0 || 10 / 0 == 0);//true
        System.out.println(10 % 3 == 0 && 10 / 0 == 0);//false
        System.out.println(10 % 3 == 0 || 10 / 0 == 0);//ArithmeticException
    }
}
