import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNum = sc.nextInt();

        System.out.print("Enter second number: ");
        int secondNum = sc.nextInt();

        System.out.print("Enter third number: ");
        int thirdNum = sc.nextInt();

        if (firstNum <= secondNum && secondNum < thirdNum) {
            System.out.println("Increasing");
        } else if (firstNum >= secondNum && secondNum > thirdNum) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither increasing nor decreasing");
        }

        sc.close();
    }
}