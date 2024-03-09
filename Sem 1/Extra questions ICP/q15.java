// Write a java program that reads an integer and displays all its smallest factors in increasing
// order. For example, if the input integer is 120, the output should be as follows: 2, 2, 2, 3, 5.

import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
    }
}