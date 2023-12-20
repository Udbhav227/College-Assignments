import java.util.Scanner;

public class Program_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
              sum += i;
              if (n != n / i) {
                sum += n / i;
              }
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
        Enter a number: 496
        496 is a perfect number.
 */
