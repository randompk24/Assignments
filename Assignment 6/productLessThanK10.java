import java.util.*;

public class productLessThanK10 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int product = 1;
            
            for (int j = i; j < arr.length; j++) {
                if (product * arr[j] < k) {
                    product *= arr[j];
                    count++;
                } else {
                    break;
                }
            }
        }

        System.out.println(count);

    }
}