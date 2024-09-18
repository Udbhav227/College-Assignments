import java.util.*;

public class Q1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter n: ");
      int n = sc.nextInt();
      int sum = (n * (n + 1)) / 2;
      System.out.print("Sum for first " + n + " natural number is: " + sum);
  }
}

/**
  Input: 5
  Output: 15
  Time Complexity: O(1)
**/
