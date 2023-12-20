import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();

        System.out.print("Prime numbers between " + n1 + " and " + n2 + " are: ");

        for (int i = n1; i <= n2; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) System.out.print(i + " ");
        }

        sc.close();
    }
}

/*
    OUTPUT:
        Enter the first number: 4
        Enter the second number: 15
        Prime numbers between 4 and 15 are: 5 7 11 13
 */
