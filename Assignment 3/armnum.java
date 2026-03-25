import java.util.Scanner;

public class armnum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int org = n;

        int count = 0;
        int num = 0;
        int temp = n;

        for (; temp > 0; temp = temp / 10) {
            count++;
        }

        for (; n > 0; n = n / 10) {
            int dig = n % 10;

            int r = (int) Math.pow(dig, count);

            num = num + r;

        }

        if (num == org) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

}
