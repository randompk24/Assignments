import java.util.*;

public class billcalc {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n <= 100){
            int a = n * 2;
            System.out.println(a);
        }
        else if(n > 100 && n <= 200){
            int a = n * 3;
            System.out.println(a);
        }
        else if(n > 200){
            int a = n * 5;
            System.out.println(a);
        }
    }
}
