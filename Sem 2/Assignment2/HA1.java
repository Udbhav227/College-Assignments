
import java.util.Scanner;

class Commission {
    private double sales;

    Commission(double sales) {
        this.sales = sales;
    }

    double getCommission() {
        if (sales < 0) {
            throw new IllegalArgumentException("Invalid Input");
        } else if (sales < 500) {
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

        try {
            Commission commission = new Commission(sale);
            System.out.println("Commission amount: Rs. " + commission.getCommission());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
        sc.close();
    }
}

/*
 *  Output:
 *      Enter sale: -60
 *      Invalid Input
 */