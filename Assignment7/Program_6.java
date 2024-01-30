import java.util.Scanner;

public class Program_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of the array: ");
        int n = sc.nextInt();


        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Original array: ");
        printArray(arr);

        reverseArray(arr);

        System.out.print("Reversed array: ");
        printArray(arr);

        sc.close();
    }

    private static void reverseArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
    }

    private static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}

/*
    OUTPUT:
        Enter length of the array: 6
        Enter elements: 34 65 21 86 39 48
        Original array: 34 65 21 86 39 48
        Reversed array: 48 39 86 21 65 34
 */