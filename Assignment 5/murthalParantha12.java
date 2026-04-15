import java.util.Scanner;

public class murthalParantha12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int n = sc.nextInt();

        int cook[] = new int[n];

        for (int i = 0; i < n; i++) {
            cook[i] = sc.nextInt();
        }

        int result = 0;

        int maxRank = 0;
        for (int i = 0; i < n; i++) {
            maxRank = Math.max(maxRank, cook[i]);
        }

        int start = 0;
        int end = maxRank * ((p * (p + 1)) / 2);

        while (start <= end) {
            int mid = (start + end) / 2;
            int totalParanthas = 0;

            for (int i = 0; i < n; i++) {
                int timeUsed = 0;
                int j = 1;

                while (true) {
                    timeUsed += cook[i] * j;
                    if (timeUsed > mid)
                        break;

                    totalParanthas++;
                    j++;

                    if (totalParanthas >= p)
                        break;
                }

                if (totalParanthas >= p)
                    break;
            }

            if (totalParanthas >= p) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        System.out.println(result);
    }
}
