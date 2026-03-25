import java.util.*;

public class ihg {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int r = 2 * n + 1;
        int mid = (r + 1) / 2;

        for (int i = 1; i <= r; i++) {
            int d = Math.abs(mid - i);

            int num = n;
            for (int j = 1; j <= mid - d; j++, num--) {
                System.out.print(num + " ");
            }

            for (int space = 1; space <= 2 * d - 1; space++) {
                System.out.print(" " + " ");
            }

            int numb = d;
            if (i == mid) {
                int numr = d + 1;
                for (int k = 1; k < mid; k++, numr++) {
                    System.out.print(numr + " ");
                }
            } else {
                for (int k = 1; k <= mid - d; k++, numb++) {
                    System.out.print(numb + " ");
                }
            }

            System.out.println();
        }
    }

}
