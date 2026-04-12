import java.util.*;

public class pairOfRoses06 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int arr[] = new int[n];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            int rose1 = 0;
            int rose2 = 0;

            int m = sc.nextInt();

            int minimum = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {

                for (int j = i + 1; j < arr.length; j++) {
                    if (m == arr[i] + arr[j]) {
                        int min = Math.abs(arr[i] - arr[j]);
                        if (min < minimum) {
                            rose1 = arr[i];
                            rose2 = arr[j];
                            minimum = min;
                        }
                    }
                }
            }

            if (rose1 > rose2) {
                int temp = rose1;
                rose1 = rose2;
                rose2 = temp;
            }

            System.out.print("Deepak should buy roses whose prices are "
                    + rose1 + " and " + rose2 + ".");

            System.out.println();
        }
    }
}