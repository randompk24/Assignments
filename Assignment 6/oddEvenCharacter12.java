import java.util.*;

public class oddEvenCharacter12 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int ascii = ch;

            if (i % 2 == 0) {
                ascii++;
            } else {
                ascii--;
            }

            char a = (char) ascii;
            System.out.print(a);
        }
    }
}