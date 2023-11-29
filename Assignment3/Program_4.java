import java.util.Scanner;

public class Program_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Generating a random number between 1 and 9
        int compGuess = (int) (9 * Math.random() + 1);

        System.out.print("Guess the number: ");
        int userGuess = sc.nextInt();

        if (userGuess == compGuess) {
            System.out.println("You got it right!");
        } else if (userGuess + 1 == compGuess || userGuess - 1 == compGuess) {
            System.out.println("Almost got it!");
        } else {
            System.out.println("You got it wrong.");
        }

        System.out.println("Computer's guess: " + compGuess);
        sc.close();
    }
}
