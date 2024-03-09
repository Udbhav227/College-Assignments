import java.util.Scanner;

public class EvilNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        String binary = Integer.toBinaryString(n);
        int count = 0;

        for (char ch : binary.toCharArray()) {
            if (ch == '1') count++;
        }

        if ((count & 1) == 0) {
            System.out.println(n + " is an Evil number.");
        } else {
            System.out.println(n + " is not an Evil number.");
        }

    }
}

// Enter a positive number: 60
// 60 is an Evil number.