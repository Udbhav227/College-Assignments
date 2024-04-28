import java.util.Scanner;

public class HA5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println(reverseString(str));
    }

    public static String reverseString(String input) {
        // Base condition
        if (input.isEmpty()) return "";

        // Smallest amount of work I can do in each iteration
        return reverseString(input.substring(1)) + input.charAt(0);
    }
}

/*
 *  OUTPUT:
 *      Enter a string: pots&pans
 *      snap&stop
 */
