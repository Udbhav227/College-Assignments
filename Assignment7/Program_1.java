import java.util.Scanner;

public class Program_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int N = sc.nextInt();

        int[] arr = new int[N];
        System.out.print("Enter elements: ");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Sum and average
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }

        double avg = (double) sum / N;
        System.out.println("Sum = "+ sum + "\nAverage = " + avg);

        sc.close();
    }
}

// OUTPUT:
//     Enter size of the array: 5
//     Enter elements: 1 2 3 4 5
//     Sum = 15
//     Average = 3.0