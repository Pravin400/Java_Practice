package _4_control_statements._1_If_else;

public class Demo08 {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 22;
        int number3 = 33;
        if(number1 > number2){
            if (number1 > number3){
                System.out.println(number1+" number is greater");
            }
        }
//
//        if(number1 > number2 && number1 > number3){
//            System.out.println(number1+" number is greater");
//        }
        else if (number2 > number3){
            System.out.println(number2 + " number is greater ");
        }
        else{
            System.out.println(number3+ " number is greater");
        }
    }
}
