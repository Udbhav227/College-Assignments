import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real value x and a positive integer n: ");
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(x + "^" + n + " = " + power(x, n));
    }

    public static int power(int x, int n) {
        if (n == 0) return 1;
        else return x * power (x, n - 1);
    }
}

/*
 *  OUTPUT:
 *      Enter real value x and a positive integer n: 7 2
 *      7^2 = 49
 */
