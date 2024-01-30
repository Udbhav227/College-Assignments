import java.util.Scanner;

public class Program_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = createArray(n, sc);

        // Menu driven choices

        char choice;
        do {
            System.out.println("\n-----Menu-----");
            System.out.println("a. Create an array of N integers");
            System.out.println("b. Display the array elements");
            System.out.println("c. Insert an element at specific position");
            System.out.println("d. Delete an element at a given position");
            System.out.println("e. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.next().charAt(0);

            switch (choice) {
                case 'a':
                    System.out.print("Enter the new size of the array: ");
                    n = sc.nextInt();
                    arr = createArray(n, sc);
                    break;
                case 'b':
                    displayArray(arr, n);
                    break;
                case 'c':
                    System.out.print("Enter the position where you want to insert: ");
                    int pos = sc.nextInt();
                    if (pos < 0 || pos > n) {
                        System.out.println("Invalid position");
                    } else {
                        System.out.print("Enter the element to insert: ");
                        int elem = sc.nextInt();
                        arr = insertElement(arr, n, pos, elem);
                        n++;
                    }
                    break;
                case 'd':
                    System.out.print("Enter the position where you want to delete: ");
                    pos = sc.nextInt();
                    if (pos < 0 || pos >= n) {
                        System.out.println("Invalid position");
                    } else {
                        arr = deleteElement(arr, n, pos);
                        n--;
                    }
                    break;
                case 'e':
                    System.out.println("Exiting the program");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 'e');

        sc.close();
    }

    public static int[] createArray(int n, Scanner sc) {
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void displayArray(int[] arr, int n) {
        System.out.print("The array elements are: [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print("]\n");
    }

    public static int[] insertElement(int[] arr, int n, int pos, int elem) {
        int[] newArr = new int[n + 1];
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        newArr[pos] = elem;
        for (int i = pos + 1; i < n + 1; i++) {
            newArr[i] = arr[i - 1];
        }
        return newArr;
    }

    public static int[] deleteElement(int[] arr, int n, int pos) {
        int[] newArr = new int[n - 1];
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        for (int i = pos + 1; i < n; i++) {
            newArr[i - 1] = arr[i];
        }
        return newArr;
    }
}