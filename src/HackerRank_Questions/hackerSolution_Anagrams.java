package HackerRank_Questions;

import java.util.Scanner;
    import java.util.Arrays;


    public class hackerSolution_Anagrams {

        static boolean isAnagram(String a, String b) {
            // Complete the function
            a = a.toLowerCase();
            b = b.toLowerCase();

//  if length of the string is not match then also a not anagram
            if (a.length() != b.length()) {

                return false;
            }
//  correct logic is
//convert string to chararray
//the sort that and check the it is same or equal or not that'it

            // Convert to char array and sort
            char[] arr1 = a.toCharArray();
            char[] arr2 = b.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
//            System.out.println(arr1+"\t"+arr2);

//            if(arr1 == arr2) {
//                return true;
//            }
//            else {
//                return false;
//                }

            return Arrays.equals(arr1, arr2);

//            worrong logic
//            int matchcount = 0;
//            for (int i = 0; i < a.length(); i++) {
//                for (int j = 0; j < b.length(); j++) {
//                    if(a.charAt(i)==b.charAt(j)){
//                        char  c = b.charAt(j);
//                        b=b.replace(String.valueOf(c),"");
//                        matchcount ++;
//                        System.out.println(b);
//                        break;
//                    }
//                }
//            }

        }


        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String a = scan.next();
            String b = scan.next();
            scan.close();
            boolean ret = isAnagram(a, b);
            System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        }
    }


