import java.util.*;

public class mummyMotivationSpeech10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        boolean isLower = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (j > i && arr[i][j] != 0) {
                    isLower = false;
                }
            }
        }

        System.out.println(isLower);
    }

}
