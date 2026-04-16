import java.util.Arrays;
import java.util.Scanner;

public class aggressiveCow14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();

        int stall[] = new int[n];
        for (int i = 0; i < n; i++) {
            stall[i] = sc.nextInt();
        }

        Arrays.sort(stall);

        int result = 0;
        int start = 1;
        int end = stall[n - 1] - stall[0];

        while (start <= end) {
            int mid = (start + end) / 2;
            int cow = 1;
            int prev = 0;

            for (int i = 1; i < n; i++) {
                int distance = stall[i] - stall[prev];

                if (distance >= mid) {
                    cow++;
                    prev = i;
                }
            }

            if (cow >= c) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(result);
    }
}