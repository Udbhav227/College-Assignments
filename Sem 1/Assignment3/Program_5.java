// i will update this code using nested if-else

import java.util.Scanner;

public class Program_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        boolean isLeapYear = year % 4 == 0 && ((year % 100 != 0) || (year % 400 == 0));
        System.out.println(year + " is a leap year: " + isLeapYear);

        sc.close();
    }
}
