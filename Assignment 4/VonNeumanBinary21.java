import java.util.*;

public class VonNeumanBinary21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long arr[] = new long[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLong();
        }

        for (int i = 0; i < arr.length; i++) {
            long temp = arr[i];
            int num = 0;
            int j = 0;
            while (temp > 0) {
                long d = temp % 10;
                if (d == 1) {
                    num += (int) Math.pow(2, j);
                }
                temp /= 10;
                j++;
            }
            arr[i] = num;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}