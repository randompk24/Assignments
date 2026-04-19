import java.util.*;

public class toggleCase11 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for (int i = 0; i < s.length(); i++) {

            char a = s.charAt(i);
            if (a >= 'A' && a <= 'Z') {
                System.out.print(Character.toLowerCase(a));
            } else {
                System.out.print(Character.toUpperCase(a));
            }
        }
    }
}