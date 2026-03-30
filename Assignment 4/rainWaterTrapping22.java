import java.util.*;

public class rainWaterTrapping22 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            int l = 0;
            int r = arr.length - 1;
            int water = 0;
            int maxl = 0;
            int maxr = 0;

            while (l < r) {

                if (arr[l] <= arr[r]) {
                    if (arr[l] >= maxl) {
                        maxl = arr[l];
                    } else {
                        water += maxl - arr[l];
                    }
                    l++;
                } else {
                    if (arr[r] >= maxr) {
                        maxr = arr[r];
                    } else {
                        water += maxr - arr[r];
                    }
                    r--;
                }
            }

            System.out.println(water);
        }
    }
}
