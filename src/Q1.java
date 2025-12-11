import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How Many Digits You Want To Enter : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter "+n+" Digits : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int x : arr) {
            if (x % 2 == 0) even.add(x);
            else odd.add(x);
        }

        Collections.sort(even);
        odd.sort(Collections.reverseOrder());

        int e = 0, o = 0;
        for(int i=0;i<n;i++){
            if(arr[i] % 2 == 0) arr[i] = even.get(e++);
            else arr[i] = odd.get(o++);
        }
        System.out.print("Result : ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
