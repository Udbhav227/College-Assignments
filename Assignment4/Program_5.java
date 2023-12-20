
import java.util.Scanner;

public class Program_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int j = 1; j <= Math.sqrt(i); j++) {
        if (i % j == 0) {
          sum += j;
          if (i != i / j) {
            sum += i / j;
          }
        }

        if (n == sum)
            System.out.println(n + " is a perfect number.");
        else
            System.out.println(n + " is not a perfect number.");

        sc.close();
    }
}

/*
    Output:
        Enter a number: 420
        420 is not a perfect number.
 */