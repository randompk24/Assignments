import java.util.*;
public class div3and7{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 3 == 0 && n % 7 == 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}