import java.util.Scanner;

public class Program_1e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        int sum1 = 1, sum2 = 1;

        for (int i = 2; i <= Math.sqrt(n1); i++) {
            if (n1 % i == 0) {
                sum1 += i;
                if (i != n1/i) {
                    sum1 += n1/i;
                }
            }
        }

        for (int i = 2; i <= Math.sqrt(n2); i++) {
            if (n2 % i == 0) {
                sum2 += i;
                if (i != n2/i){
                    sum2 += n2/i;
                }
            }
        }

        if (sum1 == n2 && sum2 == n1)
            System.out.println(n1 + " and " + n2 + " are amicable numbers.");
        else
            System.out.println(n1 + " and " + n2 + " are not amicable numbers.");

        sc.close();
    }
}

/*
    OUTPUT:
        Enter first number: 220
        Enter second number: 284
        220 and 284 are amicable numbers.
 */