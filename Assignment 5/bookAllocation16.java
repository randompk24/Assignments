import java.util.*;

public class bookAllocation16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int m = sc.nextInt();

            int pages[] = new int[n];

            for (int i = 0; i < n; i++) {
                pages[i] = sc.nextInt();
            }

            int result = 0;

            int start = 0;
            int end = 0;
            for (int i = 0; i < n; i++) {
                start = Math.max(start, pages[i]);
                end += pages[i];
            }

            while (start <= end) {
                int mid = (start + end) / 2;
                int students = 1;
                int totalPages = 0;

                for (int i = 0; i < n; i++) {
                    if (totalPages + pages[i] <= mid) {
                        totalPages += pages[i];
                    } else {
                        students++;
                        totalPages = pages[i];
                    }
                }

                if (students <= m) {
                    result = mid;
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            System.out.println(result);
        }
    }
}
