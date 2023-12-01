import java.util.Scanner;

public class HA_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int input = sc.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int dayElapsed = sc.nextInt();

        String today = ""; String futureDay = "";

        switch (input) {
            case 0 -> today = "Sunday";
            case 1 -> today = "Monday";
            case 2 -> today = "Tuesday";
            case 3 -> today = "Wednesday";
            case 4 -> today = "Thursday";
            case 5 -> today = "Friday";
            case 6 -> today = "Saturday";
        }

        switch ((input + dayElapsed) % 7 ) {
            case 0 -> futureDay = "Sunday";
            case 1 -> futureDay = "Monday";
            case 2 -> futureDay = "Tuesday";
            case 3 -> futureDay = "Wednesday";
            case 4 -> futureDay = "Thursday";
            case 5 -> futureDay = "Friday";
            case 6 -> futureDay = "Saturday";
        }

        System.out.println("Today is " + today + " and the future day is " + futureDay);
        sc.close();
    }
}
