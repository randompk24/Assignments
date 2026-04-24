import java.util.*;

public class kartikBhaiyaAndStrings04 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.next();

        int freq[] = new int[256];

        int i = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            freq[c]++;

            maxFreq = Math.max(maxFreq, freq[c]);

            while ((j - i + 1) - maxFreq > k) {
                freq[s.charAt(i)]--;
                i++;
            }

            maxLength = Math.max(maxLength, j - i + 1);
        }

        System.out.println(maxLength);
    }
}