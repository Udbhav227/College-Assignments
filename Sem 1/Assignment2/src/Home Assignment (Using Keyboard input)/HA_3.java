import java.util.Scanner;

public class HA_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter coordinates of all three points of the triangle: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        // Calculating lengths of the triangle sides
        double sideA = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        double sideB = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        double sideC = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));

        // Calculating the semi-perimeter (s) of the triangle
        double s = (sideA + sideB + sideC) / 2;

        // Calculating the area of the triangle using Heron's formula
        double area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));

        System.out.printf("The area of the triangle is %.1f", area);

        sc.close();
    }
}

/*
    Output:
        Enter coordinates of all three points of the triangle: 1.5 -3.4 4.6 5 9.5 -3.4
        The area of the triangle is 33.6
 */