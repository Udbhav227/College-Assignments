import java.util.Scanner;

public class Program_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the hemisphere: ");
        double rad = sc.nextDouble();
        double SA = 3 * Math.PI * Math.pow(rad, 2);
        double vol =  (2.0/3) * Math.PI * Math.pow(rad, 3);

        System.out.println("The surface area of the hemisphere is " + SA);
        System.out.println("The volume of the hemisphere is " + vol);
        sc.close();
    }
}

/*
    Output:
        Enter the radius of the hemisphere: 7.0
        The surface area of the hemisphere is 461.8141200776996
        The volume of the hemisphere is 718.3775201208659
*/
