import java.util.*;

public class replace {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long rev = 0;
        long r = 5;

        if(n == 0){
            System.out.println(r);
            return;
        }


        for (; n > 0; n = n / 10) {
            long digit = n % 10;


            if (digit == 0) {
                digit = r;
            }
            rev = rev * 10 + digit;
        }


        long num = 0;
        for (; rev > 0; rev = rev / 10) {
            long dig = rev % 10;

            num = num * 10 + dig;
        }

        System.out.print(num);

    }
}