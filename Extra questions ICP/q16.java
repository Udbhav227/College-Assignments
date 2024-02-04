/**
 * Ramanujan.java
 *
 * S. Ramanujan was an Indian mathematician who became famous for his intuition
 * for numbers. When the English mathematician G. H. Hardy came to visit him in
 * the hospital one day, Hardy remarked that the number of his taxi was 1729, a
 * rather dull number. To which Ramanujan replied, "No, Hardy! No, Hardy! It is
 * a very interesting number. It is the smallest number expressible as the sum
 * of two cubes in two different ways."
 * Verify this claim by writing a program Ramanujan.java that takes a command
 * line argument N and prints out all integers less than or equal to N that can
 * be expressed as the sum of two cubes in two different ways - find distinct
 * positive integers a, b, c, and d such that a^3 + b^3 = c^3 + d^3. Use four
 * nested for loops.
 */

public class q16 {
    public static void main(String args[]) {
        int N = Integer.parseInt(args[0]);

        int a, b, c, d, a3, b3, c3, d3;

        for (a = 1; a <= N; a++) {
            a3 = a * a * a;
            if (a3 > N) break;

            for (b = a; b <= N; b++) {
                b3 = b * b * b;
                if (a3 + b3 > N) break;

                for (c = a + 1; b <= N; c++) {
                    c3 = c * c * c;
                    if (c3 > a3 + b3) break;

                    for (d = c; d <= N; d++) {
                        d3 = d * d * d;
                        if (c3 + d3 > a3 + b3) break;

                        if (c3 + d3 == a3 + b3) {
                            System.out.print((a3+b3) + " = ");
                            System.out.print(a + "^3 + " + b + "^3 = ");
                            System.out.print(c + "^3 + " + d + "^3");
                            System.out.println();
                        }
                    }
                }
            }
        }
    }
}