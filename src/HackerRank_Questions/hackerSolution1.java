package HackerRank_Questions;

import java.io.*;
import java.util.*;

class Result1 {
    /*
     * Function to calculate the sum of elements in the list
     */
    public static int simpleArraySum(List<Integer> ar) {
        int sum = 0;
        for (int num : ar) {
            sum += num;
        }
        return sum;
    }
}

public class hackerSolution1 {
    public static void main(String[] args) throws IOException {
        // Efficient input handling
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Read the size of the array
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        // Read and convert input into a List of Integers
        List<Integer> ar = new ArrayList<>();
        String[] inputNumbers = bufferedReader.readLine().trim().split(" ");

        for (String num : inputNumbers) {
            ar.add(Integer.parseInt(num));
        }

        // Call the function and print the result
        System.out.println(Result1.simpleArraySum(ar));

        // Close the reader
        bufferedReader.close();
    }
}
