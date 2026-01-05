package Interview_Practice_Question.array_recap;

import java.util.Scanner;

public class EvenOddCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=input.nextInt();
        int []  arr=new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        System.out.println("Count of even number is : "+evenCount(arr));

        System.out.println("Count of odd number is : "+oddCount(arr));

        System.out.print("Even numbers are : ");
        evenNumbers(arr);
        System.out.print("Odd numbers are : ");
        oddNumbers(arr);


    }

    private static void oddNumbers(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println("]");
    }

    private static void evenNumbers(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println("]");
    }

    private static int oddCount(int[] arr) {
        int count=0;
        for (int i = 0; i<arr.length; i++){
            if (arr[i]%2!=0){
                count++;
            }
        }
        return count;
    }

    private static int evenCount(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        return count;
    }
}
