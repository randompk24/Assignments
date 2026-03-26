import java.util.*;

public class calculateSum12 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int t = sc.nextInt();

        while (t-- > 0) {

            int x = sc.nextInt();

            int arr2[] = new int[n];

            for (int i = 0; i < arr.length; i++) {
                int j = (n + i - x) % n;
                arr2[i] = arr[i] + arr[j];
            }

            arr = arr2;
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}