import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        printReversed(n);
    }

    public static void printReversed(int n) {
        if (n < 10) { // base condition
            System.out.print(n);
            return;
        }
        System.out.print(n % 10); // inductive hypothesis
        printReversed(n / 10); // inductive step
    }
}

/*
 *  OUTPUT:
 *      Enter number: 3735
 *      5373
 */