import java.util.Scanner;

public class HA3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of first array:");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter elements of array a: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] b = new int[n];
        System.out.println("Enter elements of array b: ");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println("Dot product of a and b: ");
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = a[i] * b[i];
            System.out.print(c[i] + " ");
        }

        sc.close();
    }
}
/*
 *  Output:
 *      Enter length of first array:
 *      4
 *      Enter elements of array a:
 *      3 5 7 9
 *      Enter elements of array b:
 *      2 1 0 3
 *      Dot product of a and b:
 *      6 5 0 27
 */
