import java.util.Scanner;

public class Program_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the (x, y) coordinate: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Point is at the origin.");
        } else if (x == 0) {
            System.out.println("(" + x + ", " + y + ") is on the y-axis.");
        } else if (y == 0) {
            System.out.println("(" + x + ", " + y + ") is on the x-axis.");
        } else {
            String quadrant;
            if (x > 0 && y > 0) {
                quadrant = "quadrant I";
            } else if (x < 0 && y > 0) {
                quadrant = "quadrant II";
            } else if (x < 0 && y < 0) {
                quadrant = "quadrant III";
            } else {
                quadrant = "quadrant IV";
            }
            System.out.println("(" + x + ", " + y + ") is in " + quadrant);
        }

        sc.close();
    }
}
