// Find output of the given code snippet:
    public class Q1a {
    public static void main(String[] args) {
        int a, b, c;
        a = -13 + 2 * 7 - 14;
        b = a++ + --a;
        System.out.println(a + " " + b);           // -13 -26
        c = a >> 2 * b-- + b++;
        System.out.println(a + " " + b + " " + c); // -13 -26 -1
    }
}
