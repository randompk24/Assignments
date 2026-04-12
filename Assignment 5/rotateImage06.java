import java.util.*;

public class rotateImage06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int rotate[][] = new int[n][n];

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                rotate[j][i] = arr[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            int k = n - 1;
            for (int j = 0; j < k; j++) {
                int temp = rotate[j][i];
                rotate[j][i] = rotate[k][i];
                rotate[k][i] = temp;
                k--;
            }
        }

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(rotate[j][i] + " ");
            }
            System.out.println();
        }
    }
}
