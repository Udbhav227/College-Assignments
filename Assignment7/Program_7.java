import java.util.Scanner;

public class Program_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal integer: ");
        int n = scanner.nextInt();

        int octal = toOctal(n);
        System.out.println("Octal representation: " + octal);

        scanner.close();
    }

    public static int toOctal(int dec) {
        int octal = 0, placeValue = 1;
        while (dec != 0) {
            octal += (dec % 8) * placeValue;
            placeValue *= 10;
            dec /= 8;
        }

        return octal;
    }
}

/*
    OUTPUT:
        Enter a decimal integer: 33
        Octal representation: 41
 */