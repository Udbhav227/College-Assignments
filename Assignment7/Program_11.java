import java.util.Scanner;

public class Program_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr);

        System.out.print("Sorted array: " );
        for (int j : arr) {
            System.out.print(j + " ");
        }

        sc.close();
    }

    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp  = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

/*
    OUTPUT:
        Enter ten numbers: 19 34 12 65 78 23 4 76 1 7
        Sorted array: 1 4 7 12 19 23 34 65 76 78
 */