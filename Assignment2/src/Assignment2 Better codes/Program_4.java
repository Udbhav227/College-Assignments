import java.util.Scanner;

public class Program_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int input = sc.nextInt();
        int sum = 0;

        sum += input % 10;
        input = input / 10;

        sum += input % 10;
        input = input / 10;

        sum += input % 10;

        System.out.println("The sum of all the digits is " + sum);

        sc.close();
    }
}

/*
    Output:
        Enter a number between 0 and 1000: 666
        The sum of all the digits is 18
*/