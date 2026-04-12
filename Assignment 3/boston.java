import java.util.Scanner;

public class boston {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        int temp = n;
        int digsum = 0;
        int facsum = 0;

        for (int i = 1; i * i <= temp; i++) {
            if (temp % i == 0) {
                if (i * i == temp) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        if (count == 2) {
            System.out.println("0");
        } else {

            for (int tem = n; tem > 0; tem = tem / 10) {
                int dig = tem % 10;

                digsum += dig;
            }

            for (int i = 2; i * i <= n; i++) {
                while (n % i == 0) {

                    for (int a = i; a > 0; a = a / 10) {
                        int digit = a % 10;
                        facsum += digit;
                    }
                    n = n / i;
                }
            }

            if (n > 1) {
                for (int b = n; b > 0; b = b / 10) {
                    int num = b % 10;
                    facsum += num;
                }
            }

            if (digsum == facsum) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }

    }

}
