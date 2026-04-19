import java.util.*;

public class StringsStringCompression05 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int i = 0;
        while (i < s.length()) {

            int count = 1;
            int j = i + 1;
            while (j < s.length()) {

                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                } else {
                    break;
                }
                j++;
            }

            if (count > 1) {
                System.out.print(s.charAt(i));
                System.out.print(count);
            } else {
                System.out.print(s.charAt(i));
            }

            i = j;

        }
    }
}