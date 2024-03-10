import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in kg: " );
        double w = sc.nextDouble();

        System.out.print("Enter height in meter: ");
        double h = sc.nextDouble();

        double bmi = w / (h * h);
        String res;

        if (bmi < 18.5 ) res = "Underweight";
        else if (bmi < 24.9) res = "Normal";
        else if (bmi < 29.9) res = "Overweight";
        else res = "Obese";

        System.out.println("The person is " + res + ".");
        sc.close();
    }
}

/*
 *  Output:
 *      Enter weight in kg: 96
 *      Enter height in meter: 1.4
 *      The person is Obese.
 */