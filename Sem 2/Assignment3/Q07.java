import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }

    public static int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        else if (n <= 1) return 1; // base case
        else return n * factorial(n - 1); // inductive step
    }
}

/*
 *  OUTPUT:
 *      Enter number: 5
 *      Factorial of 5 is 120
 */