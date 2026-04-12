import java.util.Scanner;

public class btod {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n;
        int count = 0;
        int num = 0;

        for (; temp > 0; temp = temp / 10) {
            count++;
        }

        for (int i = 0; i < count; i++, n = n / 10) {
            int dig = n % 10;

            if (dig == 1) {
                int r = (int) Math.pow(2, i);

                num = num + r;
            }
        }

        System.out.println(num);
    }

}
