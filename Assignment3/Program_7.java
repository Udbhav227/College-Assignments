import java.util.Scanner;

public class Program_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of units consumed: ");
        int unit = sc.nextInt();

        System.out.print("Do you want to pay online (y/n)? ");
        String payOnline = sc.next();

        double totalAmount;
        double discount = 0;

        if (unit <= 50)
            totalAmount = unit * 3;
        else if (unit <= 200)
            totalAmount = unit * 4.8;
        else if (unit <= 400)
            totalAmount = unit * 5.8;
        else
            totalAmount = unit * 6.2;


        System.out.println("Total amount: " + totalAmount);

        if (payOnline.equalsIgnoreCase("y")) {
            discount = totalAmount * 0.03;
            totalAmount -= discount;
        }

        System.out.println("Discount: " + discount);
        System.out.println("Amount payable: " + totalAmount);

        sc.close();
    }
}