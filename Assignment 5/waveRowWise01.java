import java.util.*;

public class waveRowWise01 {

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

        int row = 0;

        while (row < r) {

            if (row % 2 == 0) {
                int col = 0;
                while (col < c) {
                    System.out.print(arr[row][col] + ", ");
                    col++;
                }
            } else {
                int col = c - 1;
                while (col >= 0) {
                    System.out.print(arr[row][col] + ", ");
                    col--;
                }
            }

            row++;
        }

        System.out.println("END");
    }
}
