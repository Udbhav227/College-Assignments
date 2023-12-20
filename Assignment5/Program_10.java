import java.util.Scanner;

public class Program_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int a = 0, b = 1, c = 1;

        System.out.print(a + " " + b + " " + c);
        for (int i = 3; i < n; i++) {
            int nextTerm = a + b + c;
            System.out.print(" " + nextTerm);
            a = b;
            b = c;
            c = nextTerm;
        }
    }
}

/*
        // 0 1 1 2 4 7 13 24 44 for n = 9
 */
