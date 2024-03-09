// Input a number n, write a java program to compute n factorial (written as n!) where n>=0
import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int fact = 1;
        while (n >= 0) {
            if (n == 0) break;
            fact *= n--;
        }
        System.out.println(fact);
    }
}
