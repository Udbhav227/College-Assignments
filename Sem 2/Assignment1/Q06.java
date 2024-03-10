import java.util.Scanner;

public class Q06 {
    public static boolean isOdd(int n) {
        return (n & 1) != 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print(n + " is odd: " + isOdd(n));
    }
}

/*
 *  Output:
 *      Enter a number: 37
 *      37 is odd: true
 */
