public class Program_7 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean result = (a <= (b*c)) || (b <= (a*c)) || (c <= (a*b));
        System.out.println(result);
    }
}
