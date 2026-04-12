import java.util.*;

public class rowSort09 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int arr[][] = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {
                int min = j;
                for (int k = j + 1; k < c; k++) {
                    if (arr[i][k] < arr[i][min]) {
                        min = k;
                    }

                }
                int temp = arr[i][j];
                arr[i][j] = arr[i][min];
                arr[i][min] = temp;

            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}