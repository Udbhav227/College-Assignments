//Write a java program to compute the harmonic mean for a given series.
import java.util.Scanner;
public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n =  sc.nextInt();
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the value of a["+i+"]");
            sum += (double) 1 / sc.nextDouble();
        }

        double h = n / sum;

        System.out.println(h);
        sc.close();
    }
}


