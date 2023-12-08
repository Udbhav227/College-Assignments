import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int i = 0;

        System.out.print("Random numbers generated are: ");

        do {
            int random = (int) (n * Math.random() + 1);
            System.out.print(random + " ");
            i++;
        } while (i <= n);

        sc.close();
    }
}

/*
    Output:
        Enter a number: 5
        Random numbers generated are: 5 3 4 5 1 2
 */
