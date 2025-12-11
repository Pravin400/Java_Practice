import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the word: ");
        String s = sc.nextLine();

        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                char opposite = (char) ('Z' - (ch - 'A'));
                result += opposite;
            }
            else if (ch >= 'a' && ch <= 'z') {
                char opposite = (char) ('z' - (ch - 'a'));
                result += opposite;
            }
            else {
                result += ch;  // keep other characters same
            }
        }

        System.out.println(result);
    }
}
