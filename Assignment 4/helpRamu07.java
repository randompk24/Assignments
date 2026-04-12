import java.util.*;

public class helpRamu07 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            int c3 = sc.nextInt();
            int c4 = sc.nextInt();

            int n = sc.nextInt();
            int m = sc.nextInt();

            int ai[] = new int[n];
            for (int i = 0; i < ai.length; i++) {
                ai[i] = sc.nextInt();
            }

            int bi[] = new int[m];
            for (int i = 0; i < bi.length; i++) {
                bi[i] = sc.nextInt();
            }

            int rickshaw = 0;
            for (int i = 0; i < ai.length; i++) {
                rickshaw += Math.min(ai[i] * c1, c2);
            }
            rickshaw = Math.min(rickshaw, c3);

            int cab = 0;
            for (int i = 0; i < bi.length; i++) {
                cab += Math.min(bi[i] * c1, c2);
            }
            cab = Math.min(cab, c3);

            int answer = Math.min(rickshaw + cab, c4);

            System.out.println(answer);

        }
    }
}