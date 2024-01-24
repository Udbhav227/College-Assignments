import java.util.Scanner;

public class Q3c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean isBuzz = (n % 7 == 0) | (n % 10 == 7); // using bitwise

        System.out.println(isBuzz);
        sc.close();
    }
}
