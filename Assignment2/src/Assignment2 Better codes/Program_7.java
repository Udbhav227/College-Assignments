public class Program_7 {
    public static void main(String[] args) {
        int a = 1, b = 2;
        System.out.printf("%-5s %-5s %-8s %n", "a", "b", "pow(a, b)");
        System.out.printf("%-5d %-5d %-8d %n", a, b, (int) Math.pow(a, b));
        System.out.printf("%-5d %-5d %-8d %n", ++a, ++b, (int) Math.pow(a, b));
        System.out.printf("%-5d %-5d %-8d %n", ++a, ++b, (int) Math.pow(a, b));
        System.out.printf("%-5d %-5d %-8d %n", ++a, ++b, (int) Math.pow(a, b));
        System.out.printf("%-5d %-5d %-8d %n", ++a, ++b, (int) Math.pow(a, b));
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
