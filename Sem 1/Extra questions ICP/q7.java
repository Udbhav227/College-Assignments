/*
Write a java program that prompts the user to enter a point (x, y) and checks whether the
point is within the circle centered at (0, 0) with radius 10. For example, (4, 5) is inside the
circle and (9, 9) is outside the circle,
*/
import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a point (x, y): ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        boolean isInside = Math.sqrt(x * x + y * y) <= 10;

        if (isInside) System.out.println("Point ( " + x + ", " + y +" ) is in the circle");
        else System.out.println("Point ( " + x + ", " + y +" ) is not in the circle");

        sc.close();
    }

}
