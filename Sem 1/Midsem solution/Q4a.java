import java.util.Scanner;

public class Q4a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        while (n != 0) {
            int lastDigit = n % 10;
            sum += lastDigit;
            n = n / 10;
        }

        if (sum % 9 == 0) {
            System.out.println("Divisible");
        } else {
            System.out.println("Not Divisible");
        }

        sc.close();
    }
}
