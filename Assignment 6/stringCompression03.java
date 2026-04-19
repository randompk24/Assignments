import java.util.*;
public class stringCompression03 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int i = 0;
        while (i < s.length()) {
            int count = 1;
            int j = i + 1;
            while (j < s.length()) {
                if (s.charAt(j) != s.charAt(i)) break;
                if (s.charAt(j) == s.charAt(i)) {
                    count++;
                    j++;
                }
            }

            System.out.print(s.charAt(i));
            System.out.print(count);

            i = j;
        }
    }
}