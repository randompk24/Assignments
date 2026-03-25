import java.util.*;

public class vote {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 18){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }
    }    
}
