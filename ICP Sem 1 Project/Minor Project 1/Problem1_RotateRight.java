public class Problem1_RotateRight {
    public static void main(String[] args) {
        int[] array = {10, 11, 12, 13};
        System.out.println("Original array: ");
        printArray(array);

        rotateRightBy2Bits(array);

        System.out.println("After rotation: ");
        printArray(array);

    }

    public static void rotateRightBy2Bits(int[] s) {
        int n = s.length;
        int d = 2;
        int[] temp = new int[n];

        for (int i = 0; i < n-1; i++) {
            temp[i+1] = s[i] << (32 - d);
        }
        temp[0] = s[n-1] << (32 - d);

        for (int i = 0; i < n; i++) {
            s[i] = s[i] >> 2 | temp[i];
        }
    }

    public static void printArray(int[] arr) {
        System.out.print("Decimal: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        System.out.print("\nBinary : ");
        for (int value : arr) {
            System.out.print(Integer.toBinaryString(value) + " ");
        }

        System.out.println();
    }
}
