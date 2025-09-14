package _4_control_statements._3_forDemos;

public class Demo35PrimeNumberRange {
    public static void main(String[] args) {

        boolean flag;
        for( int Start = 500;Start<=600;Start++){
            flag  = true;
            for(int i = 2;i<=Start/2;i++){
                if (Start%i == 0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println(Start+" It's Prime");
            }
            else {
                System.out.println(Start+" It's not prime");
            }


        }

    }

}
