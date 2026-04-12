import java.util.*;

public class majorityElement23 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int majority = arr[0];
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == 0 && arr[i] == 0)
                    continue;
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = 0;
                }
            }

            if (count > max) {
                max = count;
                majority = arr[i];
            }
        }

        System.out.println(majority);
    }
}