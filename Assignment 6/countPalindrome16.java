import java.util.*;

public class countPalindrome16 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            String a = "";

            for (int j = i; j < s.length(); j++) {
                a += s.charAt(j);

                boolean isPalindrome = true;
                int k = 0;
                int l = a.length() - 1;

                while (k <= l) {

                    if (a.charAt(k) != a.charAt(l)) {
                        isPalindrome = false;
                        break;
                    }

                    k++;
                    l--;
                }

                if (isPalindrome) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
