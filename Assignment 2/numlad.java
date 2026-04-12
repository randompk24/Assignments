import java.util.*;

public class numlad {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = 1;

        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= i; j++, num++){
                System.out.print(num + "\t");
            }

            System.out.println();
        }
    }
    
}
