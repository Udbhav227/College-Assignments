import java.util.Scanner;

class Commission {
    private double sales;

    Commission(double sales) {
        this.sales = sales;
    }

    double getCommission() {
        if (sales < 500) {
            return 0.02 * sales;
        } else if (sales < 5000) {
            return 0.05 * sales;
        } else {
            return 0.08 * sales;
        }
    }
}

class HA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sale: ");
        double sale = sc.nextDouble();

        if (sale < 0) {
            System.out.println("Invalid Input");
        } else {
            Commission commission = new Commission(sale);
            System.out.println("Commission amount: Rs. " + commission.getCommission());
        }
        sc.close();
    }
}

/*
 *  Output:
 *      Enter sale: -60
 *      Invalid Input
 */
