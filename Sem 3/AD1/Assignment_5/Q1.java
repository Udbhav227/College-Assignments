// Write a program to reverse an array
public class Q1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.print("Input: ");
        for (int n : arr) {
			System.out.print(n + " ");
        }
        
        int[] reversedArr = reverse(arr);
        System.out.print("\nOutput: ");
        for (int i : reversedArr) {
            System.out.print(i + " ");
        }
    }
    
    public static int[] reverse(int[] arr) {
        int[] reversedArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arr.length - 1 - i];
        }
        return reversedArray;
    }
}