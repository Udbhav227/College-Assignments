public class TwistedSum {
    public static void main(String[] args) {

        int count = 0;

        for (int i = 11; i <= 1000; i++) {
            int temp = i, reverse = 0;

            while (temp > 0) {
                int lastDigit = temp % 10;
                reverse = reverse * 10 + lastDigit;
                temp /= 10;
            }

            boolean isPrime1 = true, isPrime2 = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime1 = false;
                    break;
                }
            }

            for (int j = 2; j <= Math.sqrt(reverse); j++) {
                if (reverse % j == 0) {
                    isPrime2 = false;
                    break;
                }
            }

            if (isPrime1 && isPrime2) {
                System.out.print(i + " ");
                count++;
                if (count % 5  == 0) {
                    System.out.println();
                }
            }
        }
    }
}
