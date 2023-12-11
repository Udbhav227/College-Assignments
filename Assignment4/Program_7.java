import java.util.Scanner;

public class Program_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.println("Multiplication table of " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " \u00d7 " + i + " = " + (n * i));
        }

        scanner.close();
    }
}

/*
    Output:
        Enter a number: 9
        Multiplication table of 9:
        9 x 1 = 9
        9 x 2 = 18
        9 x 3 = 27
        9 x 4 = 36
        9 x 5 = 45
        9 x 6 = 54
        9 x 7 = 63
        9 x 8 = 72
        9 x 9 = 81
        9 x 10 = 90
 */
