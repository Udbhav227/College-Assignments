import java.util.Scanner;

public class Program_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }

        System.out.println("The mean is: " + mean(arr));
        System.out.println("The standard deviation is: " + deviation(arr));
        sc.close();
    }

    public static double mean(double[] x) {
        int n = x.length;
        double mean = 0;
        for (double v : x) {
            mean += v;
        }
        return mean / n;
    }

    public static double deviation(double[] x) {
        int n = x.length;
        double sumOfSq = 0, mean = mean(x);
        for (double v : x) {
            sumOfSq += Math.pow(v - mean, 2);
        }
        return Math.sqrt(sumOfSq / n);
    }
}

/*
    OUTPUT:
        Enter ten numbers: 1.9 2.5 3.7 2 1 6 3 4 5 2
        The mean is: 3.1100000000000003
        The standard deviation is: 1.4774640435557136 (1.5573838 ye aana chahiye tha)
 */
