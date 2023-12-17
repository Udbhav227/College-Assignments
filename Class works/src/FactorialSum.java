public class FactorialSum {
    public static void main(String[] args) {

        int sum = 0;
        int factorial = 1;

        for (int i = 1; i <= 10; i++) {
            factorial *= i;
            sum += factorial;
        }

        System.out.println(sum);
    }
}