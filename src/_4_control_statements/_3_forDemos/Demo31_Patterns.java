package _4_control_statements._3_forDemos;

public class Demo31_Patterns {
    /*
    printing this star pattern
         *
        **
       ***
      ****
     *****
    */

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
//        speces
            for (int j = 5 - i; j >= 1; j--) {
                System.out.print(" ");
            }
//        stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
