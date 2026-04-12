import java.util.Scanner;

public class spiralAntiClockWise02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int arr[][] = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int top = 0;
        int bottom = r - 1;
        int left = 0;
        int right = c - 1;

        while (top <= bottom && left <= right) {

            for (int j = top; j <= bottom; j++) {
                System.out.print(arr[j][left] + ", ");
            }
            left++;

            for (int j = left; j <= right; j++) {
                System.out.print(arr[bottom][j] + ", ");
            }
            bottom--;

            for (int j = bottom; j >= top; j--) {
                System.out.print(arr[j][right] + ", ");
            }
            right--;

            for (int j = right; j >= left; j--) {
                System.out.print(arr[top][j] + ", ");
            }
            top++;
        }

        System.out.println("END");
    }
}
