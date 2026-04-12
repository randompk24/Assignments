import java.util.*;

public class patmag {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int r = 2 * n - 1;

        for (int i = 1; i <= r; i++) {
            int d = Math.abs(n - i);

            for (int j = 1; j <= d + 1; j++) {
                System.out.print("*");
            }

            for (int space = 2; space <= 2 * ((n - d) - 1); space++) {
                System.out.print(" ");
            }

            if (i == 1 || i == r) {
                for (int k = 1; k <= d; k++) {
                    System.out.print("*");
                }
            } else {
                for (int k = 1; k <= d + 1; k++) {
                    System.out.print("*");
                }
            }

            System.out.println();

        }
    }

}
