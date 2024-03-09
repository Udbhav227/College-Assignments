public class Q2b {
    public static void main(String[] args) {
        double r = Double.parseDouble(args[0]);
        double h = Double.parseDouble(args[1]);
        double area = (Math.PI * r * r) + (2 * Math.PI * r * h);
    }
}
