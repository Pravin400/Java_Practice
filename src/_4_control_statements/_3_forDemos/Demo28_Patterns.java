package _4_control_statements._3_forDemos;

public class Demo28_Patterns {
/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            int number = 1;
            for(int j = 1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
/*

*/


    }
}
