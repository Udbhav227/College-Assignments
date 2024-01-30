import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[101];
        System.out.print("Enter the integers between 1 and 100: ");
        int in;
        while ((in = sc.nextInt()) != 0) {
            if (in >= 1 && in <= 100) arr[in]++;
            else System.out.println("Enter integer in range of 1 to 100.");
        }

        for (int i = 1; i <= 100; i++) {
            if (arr[i] > 0)
                System.out.println(i + " occurs " + arr[i] + " time" + ((arr[i] > 1) ? "s" : ""));
        }

        sc.close();
    }
}

// OUTPUT:
//        Enter the integers between 1 and 100: 1 2 3  5 6 7 5 3 2 2 1 4 6 7 8 0
//        1 occurs 2 times
//        2 occurs 3 times
//        3 occurs 2 times
//        4 occurs 1 time
//        5 occurs 2 times
//        6 occurs 2 times
//        7 occurs 2 times
//        8 occurs 1 time