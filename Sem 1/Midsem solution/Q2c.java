import java.util.Scanner;

public class Q2c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();

        int year = days / 365;
        days = days % 365;

        int month = days / 30;
        days = days % 30;

        System.out.println("Year: " + year + "\nMonth: " + month + "\nDay: " + days);
    }
}
