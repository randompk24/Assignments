import java.util.Scanner;

public class allarmnum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        for (int i = n1; i <= n2; i++) {
            int org = i;
            int count = 0;
            int num = 0;

            int a = i;
            for (; a > 0; a = a / 10) {
                count++;
            }

            int b = i;
            for (; b > 0; b = b / 10) {
                int dig = b % 10;

                int r = (int) Math.pow(dig, count);

                num = num + r;
            }

            if (num == org) {
                System.out.println(num);
            }
        }
    }

}
