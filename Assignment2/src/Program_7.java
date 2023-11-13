public class Program_7 {
    public static void main(String[] args) {
        System.out.printf("%-5s %-5s %s %n", "a", "b", "pow(a, b)");
        System.out.printf("%-5d %-5d %d %n", 1, 2, (int) Math.pow(1, 2));
        System.out.printf("%-5d %-5d %d %n", 2, 3, (int) Math.pow(2, 3));
        System.out.printf("%-5d %-5d %d %n", 3, 4, (int) Math.pow(3, 4));
        System.out.printf("%-5d %-5d %d %n", 4, 5, (int) Math.pow(4, 5));
        System.out.printf("%-5d %-5d %d %n", 5, 6, (int) Math.pow(5, 6));
    }
}

/*
    Output:
        a     b     pow(a, b)
        1     2     1
        2     3     8
        3     4     81
        4     5     1024
        5     6     15625
*/
