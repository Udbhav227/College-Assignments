import java.util.Scanner;

public class Program_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = sc.nextInt();

        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        int res = base;

        for (int i = 1; i < power; i++) {
            res = res * base;
        }

        System.out.println(base + " to the power " + power + " is: " + res);
    }
}

/*
    Output:
        Enter the base:  5
        Enter the power: 4
        5 to the power 4 is: 625
 */