import java.util.Scanner;

public class Program_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int compGuess = (int) (9 * Math.random() + 1);
        int userGuess = 0;

        while(userGuess != compGuess) {
            System.out.print("Your guess: ");
            userGuess = sc.nextInt();

            if (userGuess == compGuess) {
                System.out.println("Congrats! You got it right!");
            } else if (userGuess > compGuess) {
                System.out.println("Too high, try again!\n");
            } else {
                System.out.println("Too low, try again!\n");
            }
        }

        sc.close();
    }
}

/*
    Output:
        Your guess: 1
        Too low, try again!

        Your guess: 6
        Too high, try again!

        Your guess: 4
        Congrats! You got it right!
 */