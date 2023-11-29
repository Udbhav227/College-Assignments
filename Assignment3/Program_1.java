import java.util.Scanner;

public class Program_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age >= 18)
            System.out.println("You are eligible to cast your vote.");

        sc.close();
    }
}
