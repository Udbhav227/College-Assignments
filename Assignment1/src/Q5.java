public class Q5 {
    public static void main(String[] args) {
        int W = 1;
        int G = 2;
        int K = 3;
        int A = 4;

        System.out.println("Before Swap:");
        System.out.println("W = " + W);
        System.out.println("G = " + G);
        System.out.println("K = " + K);
        System.out.println("A = " + A);
        System.out.println("");
        // swapping W and G variables
        W = W + G;
        G = W - G;
        W = W - G;

        // swapping G and K variables
        G = G + K;
        K = G - K;
        G = G - K;

        // swapping K and A variables
        K = K + A;
        A = K - A;
        K = K - A;

        System.out.println("After Swap:");
        System.out.println("W = " + W);
        System.out.println("G = " + G);
        System.out.println("K = " + K);
        System.out.println("A = " + A);
    }
}

/*
  Output
    Before Swap:
    W = 1
    G = 2
    K = 3
    A = 4

    After Swap:
    W = 2
    G = 3
    K = 4
    A = 1
*/