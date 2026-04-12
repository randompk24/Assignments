import java.util.*;

public class sortZeroAndOne11 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int count0 = 0;
        int count1 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                count0++;
            else
                count1++;
        }

        while (count0 > 0) {
            System.out.print("0 ");
            count0--;
        }

        while (count1 > 0) {
            System.out.print("1 ");
            count1--;
        }

    }
}