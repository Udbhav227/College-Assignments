import java.util.Scanner;

public class PrintNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String result = "";

        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            result = result + n;
        }

        System.out.println(result);
    }
}
