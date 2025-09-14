package _4_control_statements._3_forDemos;

public class Demo36PerfectRange {
    public static void main(String[] args) {
        for(int i = 1;i<=10000;i++){
        int sum = 0;
            for (int j = 1;j <= i/2;j++){
                if (i%j == 0){
                    sum += j;
                }
            }
            if (sum == i){
                System.out.println("The Perfect Number is : "+ i);
            }
        }
    }
}
