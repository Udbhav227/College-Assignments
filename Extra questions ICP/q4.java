// Write a java program that takes two int values m and d from the command line and prints
// true if day d of month m is between 3/20 and 6/20, false otherwise

public class q4 {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        boolean res = false;
        if (m >= 3 && m <= 6) {
            res = m == 6 && d <= 20 || m == 3 && d >= 20;
        }
        System.out.println(res);
    }
}
