import java.util.Scanner;

public class HA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of lines: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] in = new String[n];

        System.out.println("Enter lines: ");
        for (int i = 0; i < n; i++) {
            in[i] = sc.nextLine();
        }

        System.out.println();

        System.out.println("Lines is reverse order: ");
        for (int j = n - 1; j >= 0; j--) {
            System.out.println(in[j]);
        }

        sc.close();
    }
}

/*
 *  Output:
 *      Enter number of lines:
 *      3
 *      Enter lines:
 *      This is my first line.
 *      This is my second line.
 *      The third.
 *
 *      Lines is reverse order:
 *      The third.
 *      This is my second.
 *      This is my first line.
 */