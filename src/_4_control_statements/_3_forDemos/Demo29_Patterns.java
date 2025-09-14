package _4_control_statements._3_forDemos;

public class Demo29_Patterns {
    /*
    Print this pattern
    1
    2 2
    3 3 3
    4 4 4 4
    5 5 5 5 5
    */
    public static void main(String[] args) {
        for(int row = 1;row <= 5 ;row++){
            for(int column = 1; column <= row; column++){
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
}
