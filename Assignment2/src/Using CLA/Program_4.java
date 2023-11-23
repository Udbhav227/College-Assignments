public class Program_4 {
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        double result = Math.cos(5 * t) + Math.sin(7 * t);
        System.out.println(result);
    }
}
