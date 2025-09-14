package _3_operators._9_Conditional_operators;

public class Demo02 {
    public static void main(String[] args) {
        int year = 2000;
//        boolean a = (year % 2 == 0);
//        System.out.println(a);
        System.out.println((year%400==00) || (year%4==0 && year%100 != 0)?
                "The Year "+year+" is Leap Year"
                :"The Year "+year+" is Noe-Leap Year");
    }

}
