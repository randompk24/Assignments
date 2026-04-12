import java.util.*;

public class hd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int mid = (n + 1) / 2;

        for (int i = 1; i <= n; i++) {
            int d = Math.abs(mid - i);

            for (int j = 1; j <= d + 1; j++) {
                System.out.print("*" + "\t");
            }

            for (int space = 2; space <= 2 * ((mid - d) - 1); space++) {
                System.out.print(" " + "\t");
            }

            if (i == 1 || i == n) {
                for (int k = 1; k <= d; k++) {
                    System.out.print("*" + "\t");
                }
            } else {
                for (int k = 1; k <= d + 1; k++) {
                    System.out.print("*" + "\t");
                }
            }

            System.out.println();

        }
    }

}
