import java.util.*;

public class pascal {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i <= n - 1; i++){
            int num = 1;

            for (int j = 0; j <= i; j++){
                System.out.print(num + "\t");

                num = num * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
    
}
