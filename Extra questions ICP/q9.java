public class q9 {
    public static void main(String[] args) {
        printSquare(4);
        printRightTriangle(5);
        printCharTriangle(5);
        printInvTriangle(5); // bas isme alag for loop chalana hai outer wala
        printRightAlignedTriangle(5);
    }

    private static void printSquare(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void printRightTriangle(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void printCharTriangle(int row) {

        for (int i = 1; i <= row; i++) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void printInvTriangle(int row) {
        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void printRightAlignedTriangle(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
