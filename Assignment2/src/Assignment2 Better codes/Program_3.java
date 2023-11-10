import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        int basicSalary = sc.nextInt();

        double DA = 0.4 * basicSalary;
        double HRA = 0.2 * basicSalary;
        int grossSalary = (int) (basicSalary + DA + HRA);

        System.out.println("DA is " + DA);
        System.out.println("HRA is " + HRA);
        System.out.println("Gross salary is " + grossSalary);

        sc.close();
    }
}

/*
    Output:
        Enter basic salary: 15600
        DA is 6240.0
        HRA is 3120.0
        Gross salary is 24960
*/