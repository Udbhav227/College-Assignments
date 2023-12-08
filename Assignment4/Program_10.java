import java.util.Scanner;

public class Program_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int power = 1;

        while (3 * power <= n) {
            power *= 3;
        }

        System.out.println("The largest power of 3 less than or equal to " + n + " is " + power);
    }
}

/*
    Output:
        Enter a number: 100
        The largest power of 3 less than or equal to 100 is 81
 */