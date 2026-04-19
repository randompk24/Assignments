import java.util.*;

public class differenceInAsciiCode13 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for (int i = 0; i < s.length() - 1; i++) {
            char a = s.charAt(i);
            char b = s.charAt(i + 1);

            int ans = b - a;

            System.out.print(a);
            System.out.print(ans);

        }
        System.out.print(s.charAt(s.length() - 1));
    }
}