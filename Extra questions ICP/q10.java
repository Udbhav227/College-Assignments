/*
Write a java program to print the following pattern using nested loops.

                    # # # # # # # # # # 1
                    # #   #   #   #   # 2
                    #   #     #     #   3
                    # #   #       #     4
                    #       #         # 5
                    # # #     #         6
                    #           #       7
                    # #   #       #     8
                    #   #           #   9
                    # #     #         # 10
*/

public class q10 {
    public static void main(String[] args) {
        int row = 10;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i % j == 0 || j % i ==0)
                    System.out.print("# ");
                else System.out.print("  ");
            }
            System.out.println(i);
        }
    }
}
