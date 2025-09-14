package _3_operators._1_arithmetic;

public class ArithmeticOperator4 {
    public static void main(String[] args) {
        System.out.println("Logic of the Ascii Value");
        System.out.println("'a' + 'a' : "+('a'+'a'));
        System.out.println("'A'+'a'"+('A'+'a'));
        System.out.println('a'+"a");
        System.out.println("a"+"a");

        char  ch = 'A';

        char  ch1 = 'a';
        int ascii1 = (int)ch;
        int ascii2 = (int)ch1;
        int sum = ascii1+ascii2;
        System.out.println(ch + ch1);
        System.out.println("Ascii Value of "+ch+" is : "+ascii1);
        System.out.println("Ascii Value of "+ch1+" is : "+ascii2);
        System.out.println("Addition of Ascii Value is : "+ sum);

        System.out.println("Some Numerical Operations ");
        System.out.println("Some Numerical Operations Using BODMOS Rule ");
        System.out.println(10+30%2/1+10);
        System.out.println(10+30%2/1+10+'a');
        System.out.println(10+30%2/1+10+"A");
    }
}
