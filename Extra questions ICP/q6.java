/*
Write a java program that prompts the user to enter the month and year and displays the
number of days in the month. For example, if the user entered month 2 and year 2012, the
program should display that February 2012 had 29 days. If the user entered month 3 and
year 2015, the program should display that the month had 31 days.
*/
import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the month and year: ");
        int m = sc.nextInt();
        int y = sc.nextInt();
        int d = 0;

        boolean isLeap = (y % 4 == 0) && (y % 100 != 0 || y % 400 == 0);

        if (m == 2) {
            if (isLeap) d = 29;
            else d = 28;
        } else switch (m) {
            case 1, 3, 5, 7, 8, 10, 12 : d = 31; break;
            case 2, 4, 6, 0, 11 : d = 30; break;
            default:
                System.out.println("Invalid input!");;
        }

        System.out.println(d);
        sc.close();
    }
}
