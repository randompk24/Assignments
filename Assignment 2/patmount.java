import java.util.*;

public class patmount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i < n) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + "\t");
                }

                for (int space = 1; space <= 2 * (n - i) - 1; space++) {
                    System.out.print(" " + "\t");
                }

                for (int k = i; k > 0; k--) {
                    System.out.print(k + "\t");
                }
            }

            if (i == n) {
                for (int l = 1; l <= n; l++) {
                    System.out.print(l + "\t");
                }

                for (int m = n - 1; m > 0; m--) {
                    System.out.print(m + "\t");
                }
            }

            System.out.println();
        }
    }

}
