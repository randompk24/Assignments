import java.util.*;

public class longestKUniqueCharacterSubstrings17 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            String s = sc.next();
            int k = sc.nextInt();

            int maxLength = -1;
            for (int i = 0; i < s.length(); i++) {
                int freq[] = new int[256];

                int count = 0;

                for (int j = i; j < s.length(); j++) {
                    char ch = s.charAt(j);

                    if (freq[ch] == 0) {
                        count++;
                    }
                    freq[ch]++;

                    if (count > k) {
                        break;
                    }

                    if (count == k) {
                        int length = j - i + 1;
                        if (length > maxLength) {
                            maxLength = length;
                        }
                    }
                }
            }

            System.out.println(maxLength);
        }
    }
}
