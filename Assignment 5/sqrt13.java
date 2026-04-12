import java.util.*;

public class sqrt13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();

        long start = 0;
        long end = n;
        long result = 0;

        while (start <= end) {
            long mid = (start + end) / 2;

            if (mid * mid == n) {
                result = mid;
                break;
            } else if (mid * mid < n) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(result);
    }

}
