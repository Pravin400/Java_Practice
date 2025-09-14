package _4_control_statements._3_forDemos;

public class Demo27_Patterns {
/*
printing this "*" Pattern
 *
 * *
 * * *
 * * * *
 * * * * *
 */
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
