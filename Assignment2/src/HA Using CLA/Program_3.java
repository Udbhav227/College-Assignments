public class Program_3 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int firstDigit = n / 1000;
        int lastDigit = n % 10;
        int sum = firstDigit + lastDigit;
        System.out.println(sum);
    }
}
