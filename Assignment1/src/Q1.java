public class Q1 {
    public static void main(String[] args) {
        System.out.println(2 + "bc");       // 2bc
        System.out.println(2 + 3 + "bc");   // 5bc
        System.out.println((2 + 3) + "bc"); // 5bc
        System.out.println("bc" + (2 + 3)); // bc5
        System.out.println("bc" + 2 + 3);   // bc23
    }
}
