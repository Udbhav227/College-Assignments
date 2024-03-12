import java.util.Scanner;

public class HA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b == c || a - b == c || a != 0 && b != 0 && a * b == c) {
            System.out.println("The integers " + a + ", " + b + ", " + c + " can be used in a valid formula.");
        } else {
            System.out.println("The integers " + a + ", " + b + ", " + c + " cannot be used in a valid formula.");
        }

        sc.close();
    }
}

/*
    Output:
        Enter three integers: 1 2 3
        The integers 1, 2, 3 can be used in a valid formula.
 */