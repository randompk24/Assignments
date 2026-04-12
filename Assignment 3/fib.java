import java.util.Scanner;

public class fib {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int num = 0;

        for (int i = 1; i < n; i++) {
            num = a + b;

            a = b;
            b = num;
        }

        System.out.println(num);
    }

}
