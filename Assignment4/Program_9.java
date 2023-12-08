import java.util.Scanner;

public class Program_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int n = sc.nextInt();

        String result = Integer.toString(n).replaceAll("0", "");

        System.out.println("After removing 0 from number " + n + ", the new number is " + result);

        sc.close();
    }
}

/*
    Output:
        Enter an integer number: 10203040
        After removing 0 from number 10203040, the new number is 1234
 */