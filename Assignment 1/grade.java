import java.util.*;

public class grade{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 0 || n > 100){
            System.out.println();
        }
        else if (n >= 90 && n <= 100){
            System.out.println("A");
        }
        else if (n >= 75 && n < 90){
            System.out.println("B");
        }
        else if (n >= 60 && n < 75){
            System.out.println("C");
        }
        else{
            System.out.println("Fail");
        }
        
    }
}