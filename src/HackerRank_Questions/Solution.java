package HackerRank_Questions;

import java.util.*;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
//        int t=in.nextInt();
//        for(int i=0;i<t;i++){
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        if (a >= 0 && b >= 0 && a <= 50 && b <= 50 && n >= 1 && n <= 15) {
            int sum = a;
            for (int j = 0; j <= n; j++) {
                int power = (int) Math.pow(2, j);
                if (power > 1) {
                    sum += (int) (Math.pow(2, j) + b);
                    System.out.print(sum + " ");
                } else {
                    sum += b;
                    System.out.print(sum + " ");
                }
                System.out.println();
            }
//        }
            in.close();
        }
    }
}
