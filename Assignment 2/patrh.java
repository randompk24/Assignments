import java.util.*;

public class patrh {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int r = 2 * n - 1;

        for (int i = 1; i <= r; i++) {
            int d = Math.abs(n - i);
            int num = n - d;

            for (int space = 1; space <= d; space++) {
                System.out.print(" " + "\t");
            }

            for (int j = n - d; j > 0; j--, num++) {
                System.out.print(num + "\t");
            }

            int numb = 2 * (n - (d + 1));
            for (int k = 1; k <= (n - 1) - d; k++, numb--) {
                System.out.print(numb + "\t");
            }

            System.out.println();
        }

    }

}
