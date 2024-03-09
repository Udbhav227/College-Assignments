public class SpyNumber {
    public static void main(String[] args) {
        int num = 123;
        if (isSpyNumber(num)) {
            System.out.println(num + " is a Spy number.");
        } else {
            System.out.println(num + " is not a Spy number.");
        }
    }

    private static boolean isSpyNumber(int n) {
        int sum = 0, prod = 1, temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            prod *= digit;
            temp /= 10;
        }
        return sum == prod;
    }
}

// 123 is a Spy number.