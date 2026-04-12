import java.util.*;

public class bonus{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();

        if (e >= 5){
            int a = s / 10;
            System.out.println(a);
        }
        else{
            System.out.println("0");
        }
    }
}