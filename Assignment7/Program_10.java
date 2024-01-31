import java.util.Scanner;

public class Program_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] distinct = eliminateDuplicates(arr);

        System.out.print("The distinct numbers are: ");
        for (int n : distinct) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static int[] eliminateDuplicates(int[] list) {
        int[] temp = new int[list.length];

        int count = 0;

        for (int i = 0; i < list.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (list[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[count++] = list[i];
            }
        }

        int newArr[] = new int[count];

        for (int i = 0; i < count; i++) {
            newArr[i] = temp[i];
        }

        return newArr;
    }
}

/*
    OUTPUT:
        Enter ten numbers: 1 2 3 2 1 6 3 4 5 2
        The distinct numbers are: 1 2 3 6 4 5

        You can use Hashset for more efficient solution
 */