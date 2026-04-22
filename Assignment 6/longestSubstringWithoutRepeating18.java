//This is a code without using sliding window, so it's time complexity is not optimal.
//This question i done using brute force.
//The testcases are still passing on the codeblock compiler.

import java.util.*;

public class longestSubstringWithoutRepeating18 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            String a = "";

            for (int j = i; j < s.length(); j++) {
                a += s.charAt(j);

                boolean nonRepeating = true;
                int k = 0;
                while (k < a.length()) {
                    int l = k + 1;

                    while (l < a.length()) {
                        if (a.charAt(k) == a.charAt(l)) {
                            nonRepeating = false;
                            break;
                        }
                        l++;
                    }

                    if (!nonRepeating) {
                        break;
                    }
                    k++;
                }

                if (nonRepeating) {
                    maxLength = Math.max(maxLength, a.length());
                } else {
                    break;
                }
            }
        }

        System.out.println(maxLength);
    }
}