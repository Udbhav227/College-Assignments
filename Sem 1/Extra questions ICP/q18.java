// Simulate multiplication using addition input a, b is integers
import java.util.Scanner;

public class q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b < 0) {
            a = -a;
            b = -b;
        }

        int res = 0;
        for (int i = 1; i <= b; i++) {
            res += a;
        }

        sc.close();
    }
}