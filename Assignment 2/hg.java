import java.util.*;

public class hg {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 2 * n + 1;
        int mid = (r + 1) / 2;

        for (int i = 1; i <= r; i++) {
            int d = Math.abs(mid - i);
            int num = d;

            for (int space = 1; space <= mid - d - 1; space++) {
                System.out.print(" " + " ");
            }

            for (int j = 1; j <= d + 1; j++, num--) {
                System.out.print(num + " ");
            }

            for (int k = 1; k <= d; k++) {
                System.out.print(k + " ");
            }

            System.out.println();
        }
    }

}
