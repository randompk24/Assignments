import java.util.Scanner;

public class chewnum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long temp = n;

        long rev = 0;
        long count = 0;

        for (; temp > 0; temp = temp / 10) {
            count++;
        }

        for (; n > 0; n = n / 10) {
            long t = n % 10;

            long dig = 9 - t;
            long min = Math.min(t, dig);

            if (n < 10 && dig == 0) {
                rev = rev * 10 + t;

            } else {
                rev = rev * 10 + min;
            }
        }

        long num = 0;
        for (long i = 1; i <= count; i++, rev = rev / 10) {
            long digit = rev % 10;

            num = num * 10 + digit;
        }

        System.out.println(num);
    }

}
