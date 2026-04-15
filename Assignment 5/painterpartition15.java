import java.util.*;

public class painterPartition15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();

        int board[] = new int[n];

        for (int i = 0; i < n; i++) {
            board[i] = sc.nextInt();
        }

        int result = 0;

        int start = 0;
        int end = 0;
        for (int i = 0; i < n; i++) {
            start = Math.max(start, board[i]);
            end += board[i];
        }

        while (start <= end) {
            int mid = (start + end) / 2;
            int totalPainters = 1;
            int timeUsed = 0;

            for (int i = 0; i < n; i++) {

                if (timeUsed + board[i] <= mid) {
                    timeUsed += board[i];
                } else {
                    totalPainters++;
                    timeUsed = board[i];
                }
            }

            if (totalPainters <= k) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        System.out.println(result);
    }
}
