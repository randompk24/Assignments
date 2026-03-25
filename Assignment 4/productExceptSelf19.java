import java.util.*;

public class productExceptSelf19 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long arr[] = new long[n];
        long result[] = new long[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            long productl = 1;
            long productr = 1;

            for (int j = 0; j < i; j++) {
                productl *= arr[j];
            }

            for (int k = i + 1; k < arr.length; k++) {
                productr *= arr[k];
            }

            result[i] = productl * productr;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}