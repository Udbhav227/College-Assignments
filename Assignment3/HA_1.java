import java.util.Scanner;

public class HA_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Scissor (0), Rock (1), Paper (2) : ");
        int input = sc.nextInt();
        int computer = (int) (3 * Math.random());
        String userChoice, computerChoice = "";

        switch (input) {
            case 0 -> userChoice = "scissors";
            case 1 -> userChoice = "rock";
            case 2 -> userChoice = "paper";
            // you can skip the below line if you are not familiar with the concept of exception handling
            default -> throw new IllegalStateException("Invalid input: " + input);
        }

        switch (computer) {
            case 0 -> computerChoice = "scissors";
            case 1 -> computerChoice = "rock";
            case 2 -> computerChoice = "paper";
        }

        if (input == computer) {
            System.out.println("Computer picked " + computerChoice + ". You picked " + userChoice + " too. It's a draw!");
        } else if ((input == 0 && computer == 1)
                || (input == 1 && computer == 2)
                || (input == 2 && computer == 0)) {
            System.out.println("Computer picked " + computerChoice + ". You picked " + userChoice + ", You won!!");
        } else {
            System.out.println("Computer picked " + computerChoice + ". You picked " + userChoice + ", You lost!");
        }

        sc.close();
    }
}