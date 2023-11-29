import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many mls of water have Alice drunk today? ");
        int waterAmount = sc.nextInt();

        if (waterAmount >= 5000) System.out.println("Yes, Alice is following doctor's advice.");
        else System.out.println("No, Alice is not following doctor's advice.");

        sc.close();
    }
}
