import java.util.Scanner;

public class Program_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the time in seconds: ");
        double time = sc.nextDouble();
        final double g = 32.174;
        double dist = 0.5 * g * Math.pow(time, 2);

        System.out.println("Distance travelled: " + dist);
        sc.close();
    }
}

/*
    Output:
        Enter the time in seconds: 5.4
        Distance travelled: 469.09692000000007
 */
