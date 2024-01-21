public class Program_3 {
    public static void main(String[] args) {

        // Input of two random integers  using random method of Math class. 
        int  a =(int)( 1 +  (6-1+1)* Math.random());
        int  b =(int)( 1 +  (6-1+1)* Math.random());

        // To check the values of both the random integers generated.
        System.out.println("The two random integers are : ");
        System.out.println(a);
        System.out.println(b);

        // Finding sum of both the random integers.
        System.out.println("Sum of the two random integers are: ");
        System.out.println(a+b);

    }
}
