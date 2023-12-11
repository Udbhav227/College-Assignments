import java.util.Scanner;

public class Program_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int n = sc.nextInt();

        int num = n, result = 0, placeValue = 1;

        while (n != 0) {
            int lastDigit = n % 10;
            if (lastDigit != 0) {
                result += lastDigit * placeValue;
                placeValue *= 10;
            }
            n /= 10;
        }

        System.out.println("After removing 0 from number " + num + ", the new number is " + result);

        sc.close();
    }
}

/*
    Output:
        Enter an integer number: 10203040
        After removing 0 from number 10203040, the new number is 1234
 */
