import java.util.*;

public class sortingPatient18 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        sortColors(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void sortColors(int[] nums) {

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                count0++;
            } else if (nums[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        int i = 0;
        while (count0 > 0) {
            nums[i] = 0;
            count0--;
            i++;
        }

        while (count1 > 0) {
            nums[i] = 1;
            count1--;
            i++;
        }

        while (count2 > 0) {
            nums[i] = 2;
            count2--;
            i++;
        }
    }
}