package Interview_Practice_Question.array_recap;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySumAndAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int arraySize =  sc.nextInt();
        int[] arr = new int[arraySize];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<arraySize;i++){

            System.out.print("Enter the element "+(1+i)+" in the array : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("array Elements are : "+Arrays.toString(arr));

//        int arraySum = Arrays.stream(arr).sum();
//        int arrayAverage = Arrays.stream(arr).sum();
        System.out.print("array Sum is : "+arraySum(arr));
        System.out.print("\narray Average is : "+arrayAverage(arr));
        System.out.print("\nelements of Array is : ");
        printArray(arr);
    }
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
    }
    public static int arraySum(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            if (arr.length == 0) return 0;

            sum+=arr[i];
        }
        return sum;
    }
    public static int arrayAverage(int[] arr){
        if (arr.length == 0) return 0;

        int average = arraySum(arr)/arr.length;
        return average;
    }
}
