
public class Program_8 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar")); // true
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();

        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }

        return true;
    }
}
