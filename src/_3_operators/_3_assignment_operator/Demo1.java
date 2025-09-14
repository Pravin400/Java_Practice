package _3_operators._3_assignment_operator;



public class Demo1 {
    public static void main(String[] args) {
        int a = 13;
        int e = 15;
        float b = 1232.055F;
        float c = 1232.055f;
        System.out.println(a);
        System.out.println(c);
        System.out.println(b);
        System.out.println(add(a,e));
        add(b,c);
    }
        public static float add(float num1 ,float num2) {
//            return num1 + num2 ;
            float sum = num1 + num2;
//            System.out.println(num1 + num2);
            return sum;
        }

    }



