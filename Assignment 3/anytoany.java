import java.util.Scanner;

public class anytoany {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sb = sc.nextInt();
        int db = sc.nextInt();
        int sn = sc.nextInt();

        int temp = sn;
        int count = 0;
        int num = 0;

        for (; temp > 0; temp = temp / 10) {
            count++;
        }

        int n = sn;
        for (int i = 0; i < count; i++, n = n / 10) {
            int dig = n % 10;

            int r = (int) Math.pow(sb, i);

            int a = dig * r;

            num = num + a;
        }

        int number = 0;
        int c = 1;
        for (; num > 0; num = num / db, c = c * 10) {
            int digit = num % db;

            number = number + (digit * c);
        }

        System.out.println(number);
    }

}
