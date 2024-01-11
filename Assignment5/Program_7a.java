public class Program_7a {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 1; i <= row; i++) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }
}

/*
    OUTPUT:
        A
        A B
        A B C
        A B C D
        A B C D E
 */
