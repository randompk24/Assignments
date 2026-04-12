import java.util.*;

public class columnMaxSum17 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int column = 0;
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int c = 0;
            for (int j = 0; j < n; j++) {
                sum += arr[j][i];
                c = i + 1;
            }

            if (sum > maxSum) {
                maxSum = sum;
                column = c;
            }
        }

        System.out.println(column + " " + maxSum);
    }
    
}
