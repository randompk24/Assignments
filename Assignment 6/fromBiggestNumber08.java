import java.util.*;

public class fromBiggestNumber08 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            String[] s = new String[n];
            for (int i = 0; i < s.length; i++) {
                s[i] = String.valueOf(arr[i]);
            }

            Arrays.sort(s, (a, b) -> (b + a).compareTo(a + b));

            String result = "";
            for (int i = 0; i < s.length; i++) {
                result += s[i];
            }

            System.out.println(result);

        }
    }
}