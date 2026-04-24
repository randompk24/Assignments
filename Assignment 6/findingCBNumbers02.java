import java.util.*;

public class findingCBNumbers02 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int cb[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };

        boolean[] used = new boolean[n];
        int result = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j + i <= n; j++) {

                int num = 0;
                boolean useIndex = true;

                for (int k = j; k < j + i; k++) {
                    if (used[k]) {
                        useIndex = false;
                        break;
                    }
                    num = num * 10 + (s.charAt(k) - '0');
                }

                if (!useIndex || num == 0 || num == 1)
                    continue;

                boolean isCB = true;

                for (int l = 0; l < cb.length; l++) {
                    if (num == cb[l]) {
                        isCB = true;
                        break;
                    }
                    if (num % cb[l] == 0) {
                        isCB = false;
                        break;
                    }
                }

                if (isCB) {
                    result++;
                    for (int k = j; k < j + i; k++) {
                        used[k] = true;
                    }
                }
            }
        }

        System.out.println(result);
    }
}