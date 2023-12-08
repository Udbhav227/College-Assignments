import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int n = number, sum = 0;

        while (n >= 1) {
            sum += n % 10;
            n /= 10;
        }

        if (sum % 9 == 0) {
            System.out.println("The number " + number + " is divisible by 9.");
        } else {
            System.out.println("The number " + number + " is not divisible by 9.");
        }

        sc.close();
    }
}

/*
    Output:
        Enter the number: 621594
        The number 621594 is divisible by 9.
 */
