import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num, reverse = 0;

        while (temp > 0) {
            int lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit;
            temp /= 10;
        }

        boolean isPrime1 = true, isPrime2 = true;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime1 = false;
                break;
            }
        }

        for (int i = 2; i <= Math.sqrt(reverse); i++) {
            if (reverse % i == 0) {
                isPrime2 = false;
                break;
            }
        }

        if (isPrime1 && isPrime2)
            System.out.println(num + " is a twisted prime.");
        else
            System.out.println(num + " is not a twisted prime.");

        sc.close();
    }
}

/*
    OUTPUT:
        Enter a number: 97
        97 is a twisted prime.
 */