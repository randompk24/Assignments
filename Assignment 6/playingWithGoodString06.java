import java.util.*;

public class playingWithGoodString06 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {

            boolean isValid = true;
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);

                if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                    isValid = false;
                    break;
                }

                if (isValid) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }

        System.out.println(maxLength);
    }
}
