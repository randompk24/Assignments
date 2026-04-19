import java.util.*;

public class canYouReadThis01 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for (int i = 0; i < s.length() - 1; i++) {

            if (s.charAt(i + 1) >= 'A' && s.charAt(i + 1) <= 'Z') {
                System.out.println(s.charAt(i));
            } else {
                System.out.print(s.charAt(i));
            }
        }

        if (s.charAt(s.length() - 1) >= 'A' && s.charAt(s.length() - 1) <= 'Z') {
            System.out.println();
            System.out.println(s.charAt(s.length() - 1));
        } else {
            System.out.print(s.charAt(s.length() - 1));
        }
    }
}