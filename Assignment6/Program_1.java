public class Program_1 {
    public static int additionSimple(int x, int y) {
        return x + y;
    }

    public static int subtractionSimple(int x, int y) {
        return x - y;
    }

    public static int multiplicationSimple(int x, int y) {
        return y == 0 ? -1 : x * y;
    }

    public static double divisionSimple(int x, int y) {
        return (double) x / y;
    }

    public static int remainderSimple(int n, int m) {
        return n % m;
    }

    public static double squareRootSimple(int n) {
        return n < 0 ? -1 : Math.sqrt(n);
    }
}
