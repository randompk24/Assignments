import java.util.Scanner;

public class magicalPark07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int s = sc.nextInt();

        char arr[][] = new char[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.next().charAt(0);
            }
        }

        int row = 0;
        int strength = s;
        boolean isCrossed = true;
        while (row < n) {

            int col = 0;
            while (col < m) {

                if (arr[row][col] == '.') {
                    strength -= 2;
                } else if (arr[row][col] == '*') {
                    strength += 5;
                } else if (arr[row][col] == '#') {
                    break;
                }

                if (strength < k) {
                    isCrossed = false;
                    break;
                }

                if (col < m - 1) {
                    strength--;
                }
                col++;
            }

            if (!isCrossed) {
                break;
            }

            row++;
        }

        if (isCrossed) {
            System.out.println("Yes");
            System.out.println(strength);
        } else {
            System.out.println("No");
        }
    }
}
