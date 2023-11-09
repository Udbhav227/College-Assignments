import java.util.Scanner;

public class Program_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        int fahrenheit = sc.nextInt();

        double celsius = (fahrenheit - 32) * 5.0 / 9;
        System.out.print(fahrenheit + " degrees Fahrenheit is " + celsius + " degrees Celsius");

        sc.close();
    }
}

/*
    Output:
        Enter temperature in Fahrenheit: 54
        54 degrees Fahrenheit is 12.222222222222223 degrees Celsius
*/