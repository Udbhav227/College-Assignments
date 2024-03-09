public class Q5b {
    public static void main(String[] args) {
        int n = 1729;

        for (int a = 1; a <= n; a++) {
            int a3 = a * a * a;
            if (a3 > n) break;

            for (int b=a; b<=n; b++) {
                int b3 = b * b * b;
                if (a3 + b3 > n) break;

                for (int c=a+1; c<=n; c++) {
                    int c3 = c * c * c;
                    if (c3 > a3 + b3) break;

                    for (int d = c; d<=n; d++) {
                        int d3 = d * d * d;
                        if (c3 + d3 > a3 + b3) break;

                        if (a3 + b3 == c3 + d3) {
                            System.out.println(a + "^3 + " + b + "^3 = " + c + "^3 + " + d + "^3");
                        }
                    }
                }
            }
        }
    }
}

// 1^3 + 12^3 = 9^3 + 10^3 Hence verified!