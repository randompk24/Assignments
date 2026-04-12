import java.util.*;

public class mirrorstar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int mid = (n + 1) / 2;

        for (int i = 1; i <= n; i++) {

            int d = Math.abs(mid - i);

            for (int j = 1; j <= d; j++){
                System.out.print(" " + " \t");
            }

            for (int k = 1; k <= 2 * (mid - d) - 1; k++){
                System.out.print("*" + "\t");
            }

            System.out.println();

        }
    }

}
