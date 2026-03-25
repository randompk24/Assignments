import java.util.Scanner;

public class inverse {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int inv = 0; 
        int pos = 1;

        for (; n > 0; n = n / 10, pos++){
            int dig = n % 10;

            int r = pos * (int) Math.pow(10, dig - 1);
            
            inv = inv + r;
        }

        System.out.println(inv);
    }
    
}
