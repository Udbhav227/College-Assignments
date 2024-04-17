import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your lucky number: ");
            int luckyNumber = sc.nextInt();

            if (luckyNumber < 0) {
                throw new NumberFormatException("Lucky number can't be negative.");
            }

            System.out.println("Your lucky number is: " + luckyNumber);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e);
        }
    }
}

/*
 *  Output 1:
 *      Enter your lucky number: 0
 *      Your lucky number is: 0
 *
 *  Output 2:
 *      Enter your lucky number: -1
 *      Error: java.lang.NumberFormatException: Lucky number can't be negative.
 */
