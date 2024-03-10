import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Finding largest and smallest element and their occurrence

        int max = arr[0], min = arr[0];
        int countMax = 1, countMin = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > max){
                max = arr[i];
                countMax = 1;
            } else if (arr[i] == max){
                countMax++;
            }
            if (arr[i] < min){
                min = arr[i];
                countMin = 1;
            } else if (arr[i] == min){
                countMin++;
            }
        }

        // Finding position of first occurrence of max and last occurrence of min

        int firstOccurMax = -1, lastOccurMin = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == max && firstOccurMax == -1) {
                firstOccurMax = i + 1;
            }
            if (arr[i] == min) {
                lastOccurMin = i + 1;
            }
        }

        // Printing result

        System.out.println("Maximum element of Array is " + max + "  and occurs " + countMax + " times.");
        System.out.println("Minimum element of Array is " + min + "  and occurs " + countMin + " times.");
        System.out.println("First occurrence of maximum element is at position " + firstOccurMax + ".");
        System.out.println("Last occurrence of minimum element is at position " + lastOccurMin + ".");

        sc.close();
    }
}

/*
 * Output:
 *      Enter number of elements in array: 5
 *      Enter elements of array: 12 14 12 14 13
 *      Maximum element of Array is 14  and occurs 2 times.
 *      Minimum element of Array is 12  and occurs 2 times.
 *      First occurrence of maximum element is at position 2.
 *      Last occurrence of minimum element is at position 3.
 */