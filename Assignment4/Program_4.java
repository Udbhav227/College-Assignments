import java.util.Scanner;

public class Program_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int x = sc.nextInt();

        System.out.print("Enter the second number: ");
        int y = sc.nextInt();

        int a = x, b = y;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("GCD of " + x + " and " + y + " is: " + a);

        sc.close();
    }
}

/*
    Output:
        Enter the first number: 56
        Enter the second number: 98
        GCD of 56 and 98 is: 14
 */
