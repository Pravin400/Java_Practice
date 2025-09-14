package _4_control_statements._4_whileDemos;

public class Demo4Armstrong {
    public static void main(String[] args) {
        int number = 153;
        //Armstrong = {sum of cube of digits = given number}
        int sum = 0;
//number will be changer further so we stored into new varibale
        int originalnum = number;
//1–9: All single-digit numbers are Armstrong numbers because they are equal to themselves raised to the power of 1
//153, 370, 371, 407: between 100-1000
//1634, 8208, 9474: between 1000-10000
//54748, 92727, 93084, 548834, 1741725, 4210818, 9800817, 9926315: between100000-1000000
        while(number > 0){
            int digit = number % 10;
            sum += digit*digit*digit;
            number = number/10;
        }
        System.out.println("the sum of cube of digit is : "+sum);
        System.out.println(originalnum == sum ? "Is Equal To Original Number So It's a Armstrong Number":"Is Not-Equal To Original Number So It's Not a Armstrong Number");
        //
    }
}
