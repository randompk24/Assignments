import java.util.*;

public class maxSumPathOfTwoSortedArr14 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int nums[] = new int[t];

        int test = t;

        while (test-- > 0) {

            int n = sc.nextInt();
            int m = sc.nextInt();

            int arr1[] = new int[n];
            int arr2[] = new int[m];

            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = sc.nextInt();
            }

            for (int j = 0; j < arr2.length; j++) {
                arr2[j] = sc.nextInt();
            }

            int result = 0;
            int sum1 = 0;
            int sum2 = 0;
            int i = 0;
            int j = 0;

            while (i < arr1.length && j < arr2.length) {

                if (arr1[i] < arr2[j]) {
                    sum1 += arr1[i];
                    i++;
                } else if (arr1[i] > arr2[j]) {
                    sum2 += arr2[j];
                    j++;
                } else {
                    result += Math.max(sum1, sum2) + arr1[i];
                    sum1 = 0;
                    sum2 = 0;
                    i++;
                    j++;
                }
            }

            while (i < arr1.length) {
                sum1 += arr1[i];
                i++;
            }

            while (j < arr2.length) {
                sum2 += arr2[j];
                j++;
            }

            result += Math.max(sum1, sum2);

            nums[test] = result;
            
        }

        for (int i = t - 1; i >= 0; i--) {
            System.out.println(nums[i]);
        }
    }
}