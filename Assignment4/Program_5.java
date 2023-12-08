import java.util.Scanner;

public class Program_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sumOfFactors = 0;

        for (int i = 2; i <= 28; i++) {
            if (n % i == 0) {
                sumOfFactors += n / i;
            }
        }

        if (n == sumOfFactors)
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