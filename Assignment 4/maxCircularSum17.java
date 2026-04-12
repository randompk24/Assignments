import java.util.*;

public class maxCircularSum17 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int arr[] = new int[n];
            int arr2[] = new int[2 * n];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < arr.length; i++) {
                arr2[i] = arr[i];
                arr2[i + n] = arr[i];
            }

            int max = Integer.MIN_VALUE;
            for (int i = 0; i < arr2.length; i++) {
                int sum = 0;

                for (int j = i; j < arr2.length && j < i + n; j++) {
                    sum += arr2[j];
                    max = Math.max(max, sum);
                }

            }

            System.out.println(max);
        }
    }
}