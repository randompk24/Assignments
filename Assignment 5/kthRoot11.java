import java.util.*;

public class kthRoot11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            long n = sc.nextLong();
            long k = sc.nextLong();

            long start = 1;
            long end = n;
            long result = 0;

            while (start <= end) {
                long mid = start + (end - start) / 2;

                long ans = 1;
                boolean isValid = true;

                for (int i = 0; i < k; i++) {
                    if (ans > n / mid) {
                        isValid = false;
                        break;
                    }

                    ans *= mid;
                }

                if (isValid) {
                    result = mid;
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            System.out.println(result);
        }
    }

}
