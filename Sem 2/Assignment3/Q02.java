public class Q02 {
    public static void main(String[] args) {
        String[] favColors = {"Pink", "Teal", "Grey", "Purple", "Indigo"};

        // Trying to access an index that is out of bounds
        try {
            System.out.println("My sixth favorite color is: " + favColors[5]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);
        }

        // Trying to access a null element in the array
        try {
            favColors[1] = null;
            System.out.println("My second favorite color is: " + favColors[1].toUpperCase());
        } catch (NullPointerException ex) {
            System.out.println(ex);
        }
    }
}

/*
 *  Output:
 *      java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
 *      java.lang.NullPointerException: Cannot invoke "String.toUpperCase()" because "favColors[1]" is null
 */

