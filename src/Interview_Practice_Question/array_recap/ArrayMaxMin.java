package Interview_Practice_Question.array_recap;

import java.util.Scanner;

public class ArrayMaxMin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int arraySize=sc.nextInt();
        int [] arr=new int[arraySize];
        System.out.println("Enter the input for array elements");
        for(int i=0;i<arr.length;i++){
            if (arr.length == 0){
                System.out.println("array size is 0 elements cannot be inserted");
                break;
            }
            arr[i]=sc.nextInt();
        }
        System.out.println("Maximum Element From Array Is : "+MaxArray(arr));
        System.out.println("Minimum Element From Array Is : "+MinArray(arr));

    }

    private static int MinArray(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    private static int MaxArray(int[] arr) {

        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
