package Interview_Coding_Questions;

public class ReverseString {
    public static String reverseString(String str) {
        int start = 0;
        int end = (str.length()-1);

        char[] arr = str.toCharArray();
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return new String(arr);

    }
    public static void main(String[] args) {

        String str = "abcde";
        System.out.println(reverseString(str));
    }
}
