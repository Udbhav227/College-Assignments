// max and min element in an array
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (i > max)
                max = i;
            if (i < min)
                min = i;
        }

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
