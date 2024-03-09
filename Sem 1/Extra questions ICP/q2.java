// Write a java program that prompts the user to enter the minutes (e.g., 1 billion), and displays
// the number of years and days for the minutes.
// For simplicity, assume a year has 365 days.

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter time in seconds: ");
        int min = sc.nextInt();

        int year = min / (60 * 24 * 365);
        min %= (60 * 24 * 365);
        int days = min / (60 * 24);

        System.out.println("Year : " + year + ", days: " + days);
        sc.close();
    }
}
