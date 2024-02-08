public class NeonNumber {
    public static void main(String[] args) {
        for (int i = 100; i <= 800; i++) {
            if (isNeon(i))
                System.out.print(i + " ");
        }
    }

    private static boolean isNeon(int n) {
        return digitSum(n) == digitSum(n * n);
    }

    private static int digitSum(int n) {
        int sum = 0, temp = n;
        while (temp != 0) {
            int lastDigit = temp % 10;
            sum += lastDigit;
            temp /= 10;
        }

        return sum;
    }
}

// 100 145 180 189 190 198 199 289 351 361 369 379 388 450 451 459 460 468 495 496 550 558 559 568 585 595 639 729 739 775