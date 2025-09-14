package _4_control_statements._4_whileDemos;

public class Demo6PalindromeNumber {
    public static void main(String[] args) {
        int number  = 121;
        int originalnumber = number;
        int revdigit = 0;
        while (number > 0){
            int digit = number%10;
            revdigit = revdigit*10+digit;
            number = number/10;
        }
        System.out.println("Prograsm is to check the given number is palindrome or not");
        System.out.println("Given Number is : "+originalnumber);
        System.out.println(originalnumber == revdigit? "It's a Palindrome":"It's Not a Palindrome");
    }
}
