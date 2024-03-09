// Write a java program to compute the sum of the first n terms (n>=1) of the series.
//                  S = 1-3+5-7+9-...

import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0, c = 1, i = 1;
        while (c <= n) {
            if ((c & 1) != 0) //if odd
                sum += i;
            else sum -= i;
            i += 2;
            c++;
        }
        System.out.println(sum);
        sc.close();
    }
}
