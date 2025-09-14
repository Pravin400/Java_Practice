package _4_control_statements._3_forDemos;

public class Demo32_Patterns {
    /*
    *****
     ****
      ***
       **
        *
    */
    public static void main(String[] args) {
        for(int i = 5;i>=1;i--){
//            spaces
            for(int j = 1; j <= 5-i ;j++){
                System.out.print(" ");
            }
//            stars
            for(int k = 1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
