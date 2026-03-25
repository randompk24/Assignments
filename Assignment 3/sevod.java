import java.util.Scanner;

public class sevod {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n;
        int count = 0;
        int odd = 0;
        int even = 0;

        for (; temp > 0; temp = temp / 10){
            count++;
        }

        for (int i = 1; i <= count; i++, n = n / 10){
            int dig = n % 10;

            if (i % 2 == 0){
                even = even + dig;
            }
            else{
                odd = odd + dig;
            }
        }

        System.out.println(odd);
        System.out.println(even);
    }
    
}
