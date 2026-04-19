import java.util.*;

public class isPalindrome14 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int n = s.length();

        boolean isPalindrome = true;

        int i = 0;
        int j = n - 1;

        while (i <= j) {

            if (s.charAt(i) != s.charAt(j)) {
                isPalindrome = false;
                break;
            }

            i++;
            j--;
        }

        System.out.println(isPalindrome);
    }
}
