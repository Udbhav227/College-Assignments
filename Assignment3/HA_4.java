import java.util.Scanner;

public class HA_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        boolean divisibleBy5And6 = (n % 5 == 0) && (n % 6 == 0);
        boolean divisibleBy5Or6 = (n % 5 == 0) || (n % 6 == 0);
        boolean divisibleBy5Xor6 = (n % 5 == 0) ^ (n % 6 == 0);

        System.out.println("Is " + n + " divisible by 5 and 6? " + divisibleBy5And6);
        System.out.println("Is " + n + " divisible by 5 or 6? " + divisibleBy5Or6);
        System.out.println("Is " + n + " divisible by 5 or 6, but not both? " + divisibleBy5Xor6);

        sc.close();
    }
}
