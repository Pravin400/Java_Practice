package _3_operators._8_bitwise_operators;

public class Demo01 {
    public static void main(String[] args) {
        System.out.println(4 & 5);//4 bitwise and
        System.out.println(4 | 5);//5 bitwise or
        System.out.println(4 ^ 5);//1 bitwise XOR
        System.out.println(4 << 5);//128 bitwise Right Shift
        System.out.println(4 >> 5);//0 bitwise Left Shift
        System.out.println(~4);//-5 bitwise negation / not
        System.out.println(true & true);
        System.out.println(true || true);


        //System.out.println(4 && 5);//CTE
    }
}
