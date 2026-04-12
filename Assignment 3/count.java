import java.util.Scanner;

public class count {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();

        int count = 0;

        for (; n > 0; n = n / 10) {
            int digit = n % 10;

            if (digit == a) {
                count++;
            }
        }

        System.out.println(count);
    }

}
