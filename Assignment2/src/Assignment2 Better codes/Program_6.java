import java.util.Scanner;

public class Program_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the time in seconds: ");
        double time = sc.nextDouble();

        double dist = 0.5 * 32.174 * Math.pow(time, 2);

        System.out.printf("Distance travelled: %.3f", dist);

        sc.close();
    }
}

/*
    Output:
        Enter the time in seconds: 5.4
        Distance travelled: 469.097
 */
