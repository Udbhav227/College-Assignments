import java.util.Scanner;

public class Program_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[10];

        System.out.print("Enter ten numbers: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }

        System.out.println("The minimum number is: " + min(arr));
        sc.close();
    }

    public static double min(double[] array) {
        int n = array.length;
        double min = array[0];

        for (int i = 1; i < n; i++) {
            if (min > array[i])
                min = array[i];
        }

        return min;
    }
}

/*
    OUTPUT:
        Enter ten numbers: 1.9 2.5 3.7 2 1.5 6 3 4 5 2
        The minimum number is: 1.5
 */