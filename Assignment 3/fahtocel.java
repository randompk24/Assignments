import java.util.Scanner;

public class fahtocel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int minf = sc.nextInt();
        int maxf = sc.nextInt();
        int step = sc.nextInt();

        for (int i = minf; i <= maxf; i += step) {

            int cel = (5 * (i - 32)) / 9;

            System.out.print(i + "\t");
            System.out.println(cel);
        }
    }

}
