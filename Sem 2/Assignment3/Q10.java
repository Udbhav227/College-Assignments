import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println(solve(n));
    }

    // calculating fibonacci
    public static int solve(int n) {
        if (n == 0) return 0; // base case
        if (n == 1) return 1; // base case
        return solve(n - 1) + solve(n - 2); // inductive step
    }
}

/*
 *  OUTPUT:
 *      Enter n: 7
 *      13
 */