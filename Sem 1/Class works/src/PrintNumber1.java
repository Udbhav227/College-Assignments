
public class PrintNumber1 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
                if ((++count % 5) == 0) {
                    System.out.println();
                }
            }
        }
    }
}
