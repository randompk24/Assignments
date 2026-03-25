import java.util.Scanner;

public class shopgame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int A = sc.nextInt();
            int H = sc.nextInt();

            int as = 0;
            int hs = 0;

            for (int j = 1; j <= A; j += 2) {
                if (as + j <= A) {
                    as += j;
                } else {
                    break;
                }
            }

            for (int k = 2; k <= H; k += 2) {
                if (hs + k <= H) {
                    hs += k;
                } else {
                    break;
                }
            }

            if (as > hs) {
                System.out.println("Aayush");
            } else {
                System.out.println("Harshit");
            }
        }
    }

}
