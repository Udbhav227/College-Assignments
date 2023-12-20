// I will change this code with more optimised solution soon (this is also correct)
import java.util.Scanner;

public class Program_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i < n/2; i++) {
            if (n % i == 0) {
                sum += i;
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