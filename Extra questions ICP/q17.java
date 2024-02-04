/*
    Suppose you save $100 each month into a saving account with the annual interest rate 5%. So,
    the monthly interest rate is 0.05 / 12 = 0.00417.
    After the first month, the value in the account becomes
            100 * (1 + 0.00417) = 100.417
    After the second month, the value in the account becomes
            (100 + 100.417) * (1 + 0.00417) = 201.252
    After the third month, the value in the account becomes
            (100 + 201.252) * (1 + 0.00417) = 302.507
    and so on.
    Write a java program that prompts the user to enter an amount (e.g., 100), the annual interest
    rate (e.g., 5), and the number of months (e.g., 6) and displays the amount in the saving account
    after the given month.
*/
import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount, rate (%), and month: ");
        double amount = sc.nextDouble();
        double r = sc.nextDouble() / 12 / 100;
        int month = sc.nextInt();
        double saving = 0.0;

        for (int i = 1; i <= month; i++) {
            saving = (amount + saving) * (1 + r);
        }

        System.out.println("After " + month + " months, the amount in the savings account is: " + saving);

        sc.close();
    }
}

