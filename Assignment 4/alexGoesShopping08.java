import java.util.*;

public class alexGoesShopping08 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int t = sc.nextInt();

        while (t-- > 0) {

            int money = sc.nextInt();
            int k = sc.nextInt();

            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (money % arr[i] == 0) {
                    count++;
                }
            }

            if (count >= k) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}