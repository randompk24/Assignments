import java.util.*;

public class arrow {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mid = (n + 1) / 2;

        for (int i = 1; i <= n; i++) {
            int d = Math.abs(mid - i);

            for (int space = 1; space <= 2 * d; space++) {
                System.out.print(" " + " ");
            }

            int num = mid - d;
            for (int j = 1; j <= mid - d; j++, num--) {
                System.out.print(num + " ");
            }

            for (int space = 2; space <= 2 * ((mid - d) - 1); space++) {
                System.out.print(" " + " ");
            }

            int numb = 1;
            for (int k = 2; k <= mid - d + 1; k++, numb++) {
                if (i == 1 || i == n) {

                } else {
                    System.out.print(numb + " ");
                }
            }

            System.out.println();
        }
    }

}
