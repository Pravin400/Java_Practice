import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Word: ");
        String s = sc.nextLine();

        StringBuilder result = new StringBuilder();
        Set<Character> visited = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (visited.contains(ch)) continue;

            visited.add(ch);

            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ch) count++;
            }

            result.append(ch).append(count);
        }

        System.out.println(result);
    }
}
