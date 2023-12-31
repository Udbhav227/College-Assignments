import java.util.Scanner;

public class HA_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of minutes: ");
        int min = sc.nextInt();

        int years = min / (24 * 60 * 365);
        int days = min % (24 * 60 * 365) / (24 * 60);

        System.out.println(min + " minutes is approximately " + years + " and " + days + " days.");

        sc.close();
    }
}

/*
    Output:
        Enter number of minutes: 1000000000
        1000000000 minutes is approximately 1902 and 214 days.
 */
