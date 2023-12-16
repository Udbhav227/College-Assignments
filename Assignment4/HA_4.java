import java.util.Scanner;

public class HA_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int evenSum = 0;
        long oddProduct = 1L;

        for (int i = 1; i <= n; i++) {
            if ((i & 1) == 0) evenSum += i;
            else oddProduct *= i;
        }

        System.out.println("Sum of all even numbers: " + evenSum);
        System.out.println("Product of all odd numbers: " + oddProduct);

        sc.close();
    }
}

/*
    Output:
        Enter N: 11
        Sum of all even numbers: 30
        Product of all odd numbers: 10395
 */
