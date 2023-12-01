import java.util.Scanner;

public class HA_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter gender (M/F): ");
        String gender = sc.nextLine();

        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (gender.equalsIgnoreCase("F")) {
            if (age >= 20) {
                System.out.print("Are you married? (y/n): ");
                sc.nextLine();
                String martialStatus = sc.nextLine();
                if (martialStatus.equalsIgnoreCase("y")) {
                    System.out.println("Mrs. " + firstName + " " + lastName);
                } else {
                    System.out.println("Ms. " + firstName + " " + lastName);
                }
            } else {
                System.out.println(firstName + " " + lastName);
            }
        } else if (gender.equalsIgnoreCase("M") && age >= 20) {
            System.out.println("Mr. " + firstName + " " + lastName);
        } else {
            System.out.println(firstName + " " + lastName);
        }

        sc.close();
    }
}
