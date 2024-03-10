import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0, prod = 1, temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            prod *= digit;
            temp /= 10;
        }

        System.out.println(n + " is " + (sum == prod ? "" : "not ") + "a spy number.");
    }
}

/*
 *  Output:
 *      Enter a number: 1124
 *      1124 is a spy number.
 */