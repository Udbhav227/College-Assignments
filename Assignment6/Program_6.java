import java.util.Scanner;

public class Program_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        System.out.print("Enter the character: ");
        char ch = sc.next().charAt(0);

        System.out.println(count(str, ch));
        sc.close();
    }

    private static int count(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) count++;
        }
        return count;
    }
}
/*
    OUTPUT:
        Enter the string: Welcome
        Enter the character: e
        2
 */