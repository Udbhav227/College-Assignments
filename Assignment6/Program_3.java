import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        if (isPalindrome(n)) System.out.println(n + " is a palindrome");
        else System.out.println(n + " is not a palindrome");

        sc.close();
    }

    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reversed = reversed * 10 + lastDigit;
            number /= 10;
        }
        return reversed;
    }

    public static boolean isPalindrome (int number) {
        return number == reverse(number);
    }
}

/*
    OUTPUT:
        Enter an integer: 12321
        12321 is a palindrome
 */