import java.util.Scanner;

public class Q09 {
    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = 4, col = 4;
        double[][] arr = new double[row][col];

        System.out.print("Enter arr 4-by-4 matrix row by row: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextDouble();
            }
        }

        double sum = sumMajorDiagonal(arr);
        System.out.println("Sum of the elements in the major diagonal is " + sum);
        sc.close();
    }
}

/*
 *  Output:
 *      Enter arr 4-by-4 matrix row by row: 1 2 3 4 5 6.5 7 8 9 10 11 12 13 14 15 16
 *      Sum of the elements in the major diagonal is 34.5
 */
