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

        double[][] arr = new double[4][4];

        System.out.print("Enter arr 4-by-4 matrix row by row: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
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