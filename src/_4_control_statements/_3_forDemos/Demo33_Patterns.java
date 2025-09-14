package _4_control_statements._3_forDemos;

public class Demo33_Patterns {
    public static void main(String[] args) {
/*
     *
    * *
   * * *
  * * * *
 * * * * *
  * * * *
   * * *
    * *
     *
*/
//        upper star
        for(int i = 1;i<=5;i++){
//spaces
            for(int j = 5-i;j>=1;j--) {
                System.out.print(" ");
            }
//
            for(int k = 1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
//        lower star

/*
 * * * * *
  * * * *
   * * *
    * *
     *
*/

//
//        we use same name variabes like 'i' in out of the for loop
        for(int k = 4;k>=1;k--){
        //spaces
            for(int j = 5-k;j>=1;j--){
                System.out.print(" ");
            }
        //stars
            for(int i = 1;i<=k;i++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
