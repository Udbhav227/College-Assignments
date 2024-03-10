import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of row and columns of 2D-Array: ");
        int m = sc.nextInt(); // col
        int n = sc.nextInt(); // row

        int[][] a = new int[m][n]; // m x n matrix

        System.out.print("Enter elements of 2D-Array: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        sc.close();

        System.out.println("The elements of 2D-Array are: ");
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum += a[i][j];
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The sum of elements of the 2D-Array is " + sum);
    }
}

/*
 *  Output:
 *      Enter number of row and columns of 2D-Array: 3 3
 *      Enter elements of 2D-Array: 1 2 3 2 3 4 3 4 5
 *      The elements of 2D-Array are:
 *                  1 2 3
 *                  2 3 4
 *                  3 4 5
 *      The sum of elements of the 2D-Array is 27
 */
