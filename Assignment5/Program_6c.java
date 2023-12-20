public class Program_6c {
    public static void main(String[] args) {
        int row = 5, c = 1;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
                c++;
            }

            System.out.println();
        }
    }
}

/*
    OUTPUT:
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
 */