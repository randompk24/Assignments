import java.util.*;
public class lcm {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int max = Math.max(n1, n2);

        for (int i = max; i >= 1; i += max){

            if (i % n1 == 0 && i % n2 == 0){
                System.out.println(i);
                break;
            }
        }

    }
}