public class AutomorphicNumber {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (isAutomorphic(i))
                System.out.print(i + " ");
        }
    }

    private static boolean isAutomorphic(int n) {
        int sq = n * n;
        String num = String.valueOf(n);
        String numSq = String.valueOf(sq);

        return numSq.endsWith(num);
    }
}

// 1 5 6 25 76 376 625
