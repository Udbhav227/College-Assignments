import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0, count = 0;

        System.out.print("Random numbers generated are: ");

        do {
            int random = (int) (Math.random() * n + 1);
            System.out.print(random + " ");
            sum += random;
            count++;
        } while (count <= n);

        System.out.println();
        double average = (double) sum / n;
        System.out.println("Average of the random numbers: " + average);

        sc.close();
    }
}

/*
    Output:
        Enter a number: 5
        Random numbers generated are: 5 3 2 3 3 2
        Average of the random numbers: 3.6
 */
