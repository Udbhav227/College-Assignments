import java.util.Scanner;

public class Q05 {
    public static int sumOfDigits(int n) {
        while (n >= 10) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int res = sumOfDigits(n);
        System.out.println("Sum of digits of " + n + " until the number is single digit is " + res);
        sc.close();
    }
}

/*
 *  Output:
 *      Enter a number: 9294
 *      Sum of digits of 9294 until the number is single digit is 6
 */