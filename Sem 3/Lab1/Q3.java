// rotate array by k position
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter K: ");
        int k = sc.nextInt() % n;

        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < k)
                res[i] = arr[n + i - k];
            if (i >= k)
                res[i] = arr[i - k];
        }

        System.out.print("After rotating by " + k + " positions: ");
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
