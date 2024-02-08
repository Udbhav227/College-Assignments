
public class PetersonNumber {
    public static void main(String[] args) {
        int num = 145; // Example number

        if (isPeterson(num)) {
            System.out.println(num + " is a Peterson number.");
        } else {
            System.out.println(num + " is not a Peterson number.");
        }
    }

    private static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    private static boolean isPeterson(int n) {
        int sum = 0, temp = n;

        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == n;
    }
}
