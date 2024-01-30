import java.util.Scanner;

public class Program_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of the array: ");
        int n = sc.nextInt();


        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findSecondLargest(arr) + " is the second-largest element");

        sc.close();
    }

    private static int findSecondLargest(int[] array) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i : array) {
            if (i > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = i;
            } else if (i > secondLargest && i < firstLargest) {
                secondLargest = i;
            }
        }

        return secondLargest;
    }
}

/*
    OUTPUT:
        Enter length of the array: 5
        Enter elements: 22 98 21 43 9
        43 is the second-largest element
 */