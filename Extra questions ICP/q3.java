//  Write a java program that takes two int values a and b from the command line and prints a
//  random integer between a and b.

public class q3 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        // random int =  min + [(int) (Math.random() * ((max - min) + 1)]
        int r = a + (int) ((b - a + 1) *(Math.random()));
        System.out.println(r);
    }
}
