public class Program_7 {
    public static void main(String[] args) {

        int X = 6, Y = 9;

        System.out.println("Before Swap");
        System.out.println("X = " + X);
        System.out.println("Y = " + Y);

        int Z = X;  // Z -> temporary variable
        X = Y;
        Y = Z;

        System.out.println("After Swap");
        System.out.println("X = " + X);
        System.out.println("Y = " + Y);
    }
}

/*
  Output:
     Before Swap
     X = 6
     Y = 9
     After Swap
     X = 9
     Y = 6
*/
