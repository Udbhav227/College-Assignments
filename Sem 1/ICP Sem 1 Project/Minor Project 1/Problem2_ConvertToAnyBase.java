public class Problem2_ConvertToAnyBase {
    public static void main(String[] args) {
        int n = 420, b = 36;
        String result = convertToAnyBase(n, b);
        System.out.println(result);
    }

    public static String convertToAnyBase(int n, int b) {
        char[] code = new char[26];
        for (int i = 10; i <= 35; i++) {
            code[i - 10] = (char) ('A' + i - 10);
        }

        String res = "";
        while (n != 0) {
            int remainder = n % b;
            n = n / b;
            if (b > 10 && remainder > 9) {
                res = code[remainder - 10] + res;
            } else {
                res = remainder + res;
            }
        }

        return res;
    }
}
