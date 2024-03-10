public class Q01 {
    public static void main(String[] args) {
        int n = 67;
        int count = 0;

        System.out.println("The positive integer greater than 2 from command line" +
                " argument is " + n + ".");

        while (n > 2) {
            n = n >> 1; // or n = n / 2;
            count++;
        }

        System.out.println("The number of times one must repeatedly divide this" +
                " number by 2 before getting a value less than 2 is " + count + ".");
    }
}

/*
 *  Output:
 *      The positive integer greater than 2 from command line argument is 67.
 *      The number of times one must repeatedly divide this number by 2 before getting a value less than 2 is 5.
 */
