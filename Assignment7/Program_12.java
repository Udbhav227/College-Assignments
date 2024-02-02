import java.util.Scanner;

public class Program_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        selectionSort(arr);

        System.out.print("Sorted array: " );
        for (int j : arr) {
            System.out.print(j + " ");
        }

        sc.close();
    }

    public static void selectionSort(int arr[]) {
        int n = arr.length;

        // One by one move boundary of unsorted sub array
        for (int i = 0; i < n-1; i++) {
            // Find the minimum element in unsorted array
            int minIdx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[minIdx])
                    minIdx = j;

            // Swap the found minimum element with the first element
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}


/*
    OUTPUT:
        Enter ten numbers: 3 2 4 1 5 9 6 8 10 7
        Sorted array: 1 2 3 4 5 6 7 8 9 10
 */
