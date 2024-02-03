/*
Write a java program to print the following output using loop.
        1
        121
        1213121
        121312141213121
        1213121412131215121312141213121
*/

public class q8 {
    public static void main(String[] args) {
        String str = "";
        for (int i = 1; i <= 5; i++) {
            str += i + str;
            System.out.println(str);
        }
    }
}
