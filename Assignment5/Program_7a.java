public class Program_7a {
    public static void main(String[] args) {
        char start = 'A', end = 'E';
        for (char ch = 'A'; ch <= end; ch++) {
            for (char curr = 'A'; curr <= ch; curr++) {
                System.out.print(start + " ");
                start++;
            }

            System.out.println();
        }
    }
}

/*
    OUTPUT:
        A
        B C
        D E F
        G H I J
        K L M N O
 */