import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        boolean isDuck = false;
        String num = sc.nextLine();

        for (char ch : num.toCharArray()) {
            if (ch == '0') {
                isDuck = true;
                break;
            }
        }

        System.out.println(isDuck);
        sc.close();
    }
}

// Enter the number: 1010
// true