// Write a java program that randomly generates an integer between 1 and 12 and displays the
// English month name January, February… December for the number 1, 2... 12 accordingly.

public class q5 {
    public static void main(String[] args) {
        int r = 1 + (int) (Math.random() * (12 - 1 + 1));
        String m = "";
        switch (r) {
            case 1 : m = "January"; break;
            case 2 : m = "February"; break;
            case 3 : m = "March"; break;
            case 4 : m = "April"; break;
            case 5 : m = "May"; break;
            case 6 : m = "June"; break;
            case 7 : m = "July"; break;
            case 8 : m = "August"; break;
            case 9 : m = "September"; break;
            case 10 : m = "October"; break;
            case 11 : m = "November"; break;
            case 12 : m = "December"; break;
            default: m = "Invalid input";
        }
        System.out.println(m);
    }
}
