import java.util.Scanner;

public class BouncyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isBouncy(n));
        sc.close();
    }

    private static boolean isBouncy(int n) {
        boolean isIncreasing = false;
        boolean isDecreasing = false;

        String num = String.valueOf(n);

        for (int i = 1; i < num.length(); i++) {
            if (num.charAt(i - 1) < num.charAt(i))
                isIncreasing = true;
            else if (num.charAt(i - 1) > num.charAt(i))
                isDecreasing = true;
        }
        return isIncreasing && isDecreasing;
    }
}

// 1234321
// true
