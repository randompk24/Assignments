import java.util.*;

public class nonRepeatingCharacter07 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            String s = sc.next();
            StringBuilder sb = new StringBuilder(s);

            char ch = '0';

            int i = 0;
            while (i < s.length() - 1) {
                if (sb.charAt(i) == '0') {
                    i++;
                    continue;
                }

                int count = 1;

                for (int j = i + 1; j < s.length(); j++) {
                    if (sb.charAt(j) == '0')
                        continue;

                    if (sb.charAt(i) == sb.charAt(j)) {
                        count++;
                        sb.setCharAt(j, '0');
                    }
                }

                if (count == 1) {
                    ch = sb.charAt(i);
                    break;
                }

                i++;
            }

            if (i == s.length() - 1 && s.charAt(i) != '0') {
                ch = sb.charAt(i);
            }

            if (ch == '0') {
                System.out.println("-1");
            } else {
                System.out.println(ch);
            }
        }
    }
}