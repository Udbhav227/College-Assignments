public class SunnyNumber {
    public static void main(String[] args) {
        int num = 3; // Example number

        if (isSunny(num)) {
            System.out.println(num + " is a Sunny number.");
        } else {
            System.out.println(num + " is not a Sunny number.");
        }
    }

    private static boolean isSunny(int n) {
        double sqrt = Math.sqrt(n);
        return (sqrt - Math.floor(sqrt)) == 1;
    }
}

// 3 is not a Sunny number.