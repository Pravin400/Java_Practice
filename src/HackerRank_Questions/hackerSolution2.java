package HackerRank_Questions;

import java.io.*;
import java.math.*;


public class hackerSolution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();
        BigInteger number = new BigInteger(n);
//isProbablePrime is use to check the given number is prime or not
        if(number.isProbablePrime(1)){
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }
    }
}
