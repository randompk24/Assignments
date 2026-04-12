import java.util.*;

public class waveColWise03 {

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

        int col = 0;
        while (col < c) {

            if (col % 2 == 0) {
                int row = 0;
                while (row < r) {
                    System.out.print(arr[row][col] + ", ");
                    row++;
                }
            } else {
                int row = r - 1;
                while (row >= 0) {
                    System.out.print(arr[row][col] + ", ");
                    row--;
                }
            }

            col++;
        }

        System.out.println("END");
    }

}
