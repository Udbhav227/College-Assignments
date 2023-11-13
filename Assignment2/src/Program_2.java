import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the distance in km: ");
        int km = sc.nextInt();

        int m = km * 1000;
        int cm = m * 100;
        double ft = km * 3280.8399;
        double in = km * 39370.0787;

        System.out.println(km + " km is " + m + " meters");
        System.out.println(km + " km is " + ft + " feet");
        System.out.println(km + " km is " + in + " inches");
        System.out.println(km + " km is " + cm + " centimeters");

        sc.close();
    }
}

/*
    Output:
        Enter the distance in km: 165
        165 km is 165000 meters
        165 km is 541338.5835 feet
        165 km is 6496062.9854999995 inches
        165 km is 16500000 centimeters
*/
