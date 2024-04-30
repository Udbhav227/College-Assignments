public class HA1 {
    public static void main(String[] args) {
        int m = 14, n = 16;
        int res = gcd(m, n);
        System.out.println("gcd(" + m + ", " + n + ") = " + res);
    }

    public static int gcd(int  m, int n) {
        if (n == 0) return m;
        return gcd(n, m % n);
    }
}

// gcd(14, 16) = 2