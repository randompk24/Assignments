import java.util.Scanner;

public class dodev {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            int odd = 0;
            int even = 0;

            int num = arr[i];
            for (; num > 0; num = num / 10) {
                int dig = num % 10;

                if (dig % 2 == 0) {
                    even = even + dig;
                } else {
                    odd = odd + dig;
                }
            }

            if (odd % 3 == 0 || even % 4 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }

    }
}
