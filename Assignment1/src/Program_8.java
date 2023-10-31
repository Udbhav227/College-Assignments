public class Program_8 {
    public static void main(String[] args) {
        int X = 6;
        int Y = 9;
        System.out.println("Before swapping, X = " + X + " & Y = " + Y);

        X = X + Y;
        Y = X - Y;
        X = X - Y;
        System.out.println("After swapping, X = " + X + " & Y = " + Y);
    }
}

/*
  Output:
     Before swapping, X = 6 & Y = 9
     After swapping, X = 9 & Y = 6
*/
