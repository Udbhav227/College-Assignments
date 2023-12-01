import java.util.Scanner;

public class Program_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks obtained (out of 100): ");
        int mark = sc.nextInt();

        String grade;

        switch (mark / 10) {
            case 10, 9 -> grade = "O";
            case 8 -> grade = "A";
            case 7 -> grade = "B";
            case 6 -> grade = "C";
            case 5 -> grade = "D";
            case 4 -> grade = "E";
            default -> grade = "F";
        }

        System.out.println("Grade: " + grade);

        sc.close();
    }
}
