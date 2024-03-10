import java.util.Scanner;

public class Q10 {
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (double[] row : m) {
            sum += row[columnIndex];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = 3, col = 4;
        double[][] arr = new double[row][col];

        System.out.println("Enter a 3-by-4 matrix row by row: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < col; i++) {
            System.out.println("Sum of the elements at column " + i + " is " + sumColumn(arr, i));
        }

        sc.close();
    }
}

/**
 *  Output:
 *      Enter a 3-by-4 matrix row by row:
 *      1.5 2 3 4
 *      5.5 6 7 8
 *      9.5 1 3 1
 *      Sum of the elements at column 0 is 16.5
 *      Sum of the elements at column 1 is 9.0
 *      Sum of the elements at column 2 is 13.0
 *      Sum of the elements at column 3 is 13.0
 */