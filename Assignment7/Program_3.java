import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number to be searched: ");
        int n = sc.nextInt();
        int count = 0;
        for (int i : arr) {
            if (i == n) {
                count++;
            }
        }

        if (count > 0)
            System.out.println(n + " is present " + count + " time" + ((count > 1) ? "s" : "") + " in the array");
        else
            System.out.println(n + " is not present in the array");

        sc.close();
    }
}

/*
    OUTPUT:
        Enter integers (10): 1 2 3 4 5 6 7 89 1 1
        Enter number to be searched: 1
        1 is present 3 times in the array
 */
