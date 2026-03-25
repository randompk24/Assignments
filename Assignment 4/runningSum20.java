import java.util.*;

public class runningSum20 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int result[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            result[i] = sum;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}