package Interview_Coding_Questions;

import java.util.Arrays;

public class NthLargestNumber {
    public static int nthLargest(int [] arr,int n){
        Arrays.sort(arr);
        return arr[arr.length-n];
    }
    public static void main(String[] args) {
        int [] arr = {5,2,9,1,7};
        int n = 2;

        System.out.println(n+"th Largest Number is : "+nthLargest(arr,n));
    }
}
