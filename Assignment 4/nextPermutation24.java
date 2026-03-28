import java.util.*;

public class nextPermutation24 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int p = 0;
        int a = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                p = i + 1;
                a = i;
                break;
            }
        }

        if (a >= 0) {

            for (int i = n - 1; i >= 0; i--) {
                if (arr[a] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[a];
                    arr[a] = temp;
                    break;
                }
            }
        }

        int i = n - 1;
        int j = p;
        while (i > j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i--;
            j++;
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }

    }
}
