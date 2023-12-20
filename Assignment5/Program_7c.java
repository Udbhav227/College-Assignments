public class Program_7c {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row-i; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }
}

/*
    OUTPUT:
                1
              2 2
            3 3 3
          4 4 4 4
        5 5 5 5 5
 */