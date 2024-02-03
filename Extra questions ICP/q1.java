/*
If you have N eggs, then you have N/12 dozen eggs, with N%12 eggs left over. (This is
essentially the definition of the / and % operators for integers.) Write a java program that
asks the user how many eggs she has and then tells the user how many dozen eggs she has
and how many extra eggs are left over. A gross of eggs is equal to 144 eggs. Extend your
program so that it will tell the user how many gross, how many dozen, and how many leftover
eggs she has. For example, if the user says that she has 1342 eggs, and then your
program would respond with
        Your number of eggs is 9 gross, 3 dozen, and 10.
*/

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many eggs you have? ");
        int total = sc.nextInt();

        int gross = total / 144;
        total %= 144;

        int dozen = total / 12;
        total %= 12;

        int left = total;

        System.out.println("Your number of eggs is " + gross + " gross, " + dozen + " dozen, " + " and " + left);
    }
}

// How many eggs you have? 1342
// Your number of eggs is 9 gross, 3 dozen, and 10