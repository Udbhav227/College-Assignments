/*
    Write a java program Checkerboard that takes one command-line argument N and uses a loop
    within a loop to print out a two-dimensional N-by-N checkerboard pattern with alternating
    spaces and asterisks.
*/
public class q19 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print((i + j) % 2 == 0 ? " * " : "   ");
            }
            System.out.println();
        }
    }
}

//         *     *     *
//            *     *
//         *     *     *
//            *     *
//         *     *     *  for n = 5