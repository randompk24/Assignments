import java.util.*;

public class removeDuplicates09 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char prev = s.charAt(0);
        System.out.print(prev);

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == prev) {
                continue;
            } else {
                System.out.print(s.charAt(i));
                prev = s.charAt(i);
            }
        }
    }
}
