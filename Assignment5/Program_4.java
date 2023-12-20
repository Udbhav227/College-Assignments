import java.util.Scanner;

public class Program_4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter m: ");
        int m = sc.nextInt();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = m; i <= n; i++) {
            int factorial = 1;

            for (int j = 2; j <= i; j++) {
                factorial *= j;
            }

            System.out.print("Factorial of " + i + " is: " + factorial);
            System.out.println();

            sc.close();
        }
    }
}

/*
    OUTPUT:
        Enter m: 2
        Enter n: 5
        Factorial of 2 is: 2
        Factorial of 3 is: 6
        Factorial of 4 is: 24
        Factorial of 5 is: 120
 */