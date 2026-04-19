import java.util.*;
public class maxFrequencyCharacter15 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        int max = 0;
        char maxch = '0';   

        for (int i = 0; i < s.length(); i++) {
            int count = 1;

            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == '0' || s.charAt(j) == '0') continue;
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }

            if (count > max) {
                max = count;
                maxch = s.charAt(i);
            }
        }

        System.out.println(maxch);
        System.out.println(max);
    }
}