import java.util.Scanner;

public class Program_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of units consumed: ");
        int unit = sc.nextInt();
        double bill;

        if (unit <= 50)
            bill = unit * 3;
        else if (unit <= 200)
            bill = unit * 4.8;
        else if (unit <= 400)
            bill = unit * 5.8;
        else
            bill = unit * 6.2;

        System.out.println("Amount payable: " + bill);
    }
}
