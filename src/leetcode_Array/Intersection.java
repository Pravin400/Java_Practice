package leetcode_Array;

public class Intersection {
    public static void main(String[] args) {
        int [] num1 = {1,2,2,3};
        int [] num2 = {2,2};
        int [] intersection = new int[2];
        int k = 0;
        for(int i = 0;i<num1.length; i++){
            for(int j = 0; j<num2.length;j++){
                if(num1[i] == num2[j]){
                    intersection[k] = num1[i];
                    k++;

                }
            }
        }
        for(int m = 0;m<intersection.length; m++){
            System.out.println(intersection[m]);
        }

    }

}

