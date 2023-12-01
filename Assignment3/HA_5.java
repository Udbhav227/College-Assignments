import java.util.Scanner;

public class HA_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your gender (M/F): ");
        String gender = sc.nextLine();

        System.out.print("First name: ");
        String firstName = sc.nextLine();

        System.out.print("Last name: ");
        String lastName = sc.nextLine();

        System.out.print("Age: ");
        int age = sc.nextInt();

        if (gender.equalsIgnoreCase("F")) {
            if (age >= 20) {
                System.out.print("Are you married, " + firstName + " (y/n)? ");
                sc.nextLine();
                String martialStatus = sc.nextLine();
                if (martialStatus.equalsIgnoreCase("y")) {
                    System.out.println("Then I shall call you Mrs. " + firstName + " " + lastName);
                } else {
                    System.out.println("Then I shall call you Ms. " + firstName + " " + lastName);
                }
            } else {
                System.out.println(firstName + " " + lastName);
            }
        } else if (gender.equalsIgnoreCase("M") && age >= 20) {
            System.out.println("Then I shall call you Mr. " + firstName + " " + lastName);
        } else {
            System.out.println("Then I shall call you " + firstName + " " + lastName);
        }

        sc.close();
    }
}
