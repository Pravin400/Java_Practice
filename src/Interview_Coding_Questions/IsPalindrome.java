package Interview_Coding_Questions;

public class IsPalindrome {
    public static boolean palindrome(String str) {
        int start = 0;
        int end = (str.length()-1);

        char[] arr = str.toCharArray();
        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;

    }
    public static void main(String[] args) {

        String str = "abcba";
        System.out.println(palindrome(str));
    }
}
