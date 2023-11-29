import java.util.Scanner;

public class Program_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a, b, c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largest = Math.max(Math.max(a, b), c);

        int secondLargest;
        if (a == largest) {
            secondLargest = Math.max(b, c);
        } else if (b == largest) {
            secondLargest = Math.max(a, c);
        } else {
            secondLargest = Math.max(a, b);
        }

        System.out.println("Largest number: " + largest);
        System.out.println("2nd largest number: " + secondLargest);

        sc.close();
    }
}
