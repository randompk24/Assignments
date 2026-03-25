import java.util.Scanner;

public class series {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int a = 1;

        int n = 1;
        while (a <= n1) {
            int num = 3 * n + 2;

            if (num % n2 != 0) {
                System.out.println(num);
                a++;
            }

            n++;
        }

    }

}
