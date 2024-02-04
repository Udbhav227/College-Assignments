// Using Newton’s method, write a java program that takes integers N and k as command-line
// arguments and prints the kth root of N.
public class q14 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        double guess = n / 2.0;
        double epsilon = 1e-15;
        while (Math.abs(Math.pow(guess, k) - n) > epsilon * n) {
            guess = ((k - 1) * guess + n / Math.pow(guess, k - 1)) / k;
        }
    }
}
